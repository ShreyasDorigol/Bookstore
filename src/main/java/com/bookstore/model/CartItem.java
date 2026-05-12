package com.bookstore.model;

import java.io.Serializable;

public class CartItem implements Serializable {

    private Book book;
    private int quantity;

    // ✅ No-arg constructor
    public CartItem() {}

    // ✅ All-arg constructor
    public CartItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    // ✅ Explicit Getters
    public Book getBook() { return book; }
    public int getQuantity() { return quantity; }

    // ✅ Explicit Setters
    public void setBook(Book book) { this.book = book; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}