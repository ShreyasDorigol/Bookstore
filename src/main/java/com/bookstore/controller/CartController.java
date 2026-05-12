package com.bookstore.controller;

import com.bookstore.model.Book;
import com.bookstore.model.CartItem;
import com.bookstore.service.BookService;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "*")
public class CartController {

    private final BookService bookService;

    public CartController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public String addToCart(@RequestParam Long bookId, HttpSession session) {
        Book book = bookService.getBookById(bookId);
        if (book == null) return "Book not found";

        @SuppressWarnings("unchecked")
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        // Check if book already in cart
        for (CartItem item : cart) {
            if (item.getBook().getId().equals(bookId)) {
                item.setQuantity(item.getQuantity() + 1);
                session.setAttribute("cart", cart);
                return "Book quantity increased";
            }
        }

        // Add new item
        CartItem newItem = new CartItem(book, 1);
        cart.add(newItem);
        session.setAttribute("cart", cart);

        return "Book added to cart successfully";
    }

    @GetMapping
    public List<CartItem> getCart(HttpSession session) {
        @SuppressWarnings("unchecked")
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        return cart != null ? cart : new ArrayList<>();
    }

    @DeleteMapping("/{bookId}")
    public String removeFromCart(@PathVariable Long bookId, HttpSession session) {
        @SuppressWarnings("unchecked")
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if (cart != null) {
            cart.removeIf(item -> item.getBook().getId().equals(bookId));
            session.setAttribute("cart", cart);
        }
        return "Book removed from cart";
    }
}