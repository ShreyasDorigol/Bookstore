package com.bookstore.config;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(BookRepository bookRepository) {
        return args -> {
            if (bookRepository.count() == 0) {

                // ── Original 3 ──
                addBook(bookRepository, "The Alchemist", "Paulo Coelho",
                    "A journey to find your destiny.", 299.0,
                    "https://picsum.photos/id/1015/300/200");

                addBook(bookRepository, "Atomic Habits", "James Clear",
                    "Build good habits and break bad ones.", 399.0,
                    "https://picsum.photos/id/201/300/200");

                addBook(bookRepository, "Rich Dad Poor Dad", "Robert Kiyosaki",
                    "Learn how to make money work for you.", 249.0,
                    "https://picsum.photos/id/237/300/200");

                // ── 20 New Books ──
                addBook(bookRepository, "Sapiens", "Yuval Noah Harari",
                    "A brief history of humankind from the Stone Age to today.", 449.0,
                    "https://picsum.photos/id/24/300/200");

                addBook(bookRepository, "The Psychology of Money", "Morgan Housel",
                    "Timeless lessons on wealth, greed, and happiness.", 379.0,
                    "https://picsum.photos/id/42/300/200");

                addBook(bookRepository, "Think and Grow Rich", "Napoleon Hill",
                    "The classic guide to success and personal achievement.", 199.0,
                    "https://picsum.photos/id/57/300/200");

                addBook(bookRepository, "Deep Work", "Cal Newport",
                    "Rules for focused success in a distracted world.", 349.0,
                    "https://picsum.photos/id/65/300/200");

                addBook(bookRepository, "The 7 Habits of Highly Effective People", "Stephen Covey",
                    "Powerful lessons in personal change and leadership.", 429.0,
                    "https://picsum.photos/id/76/300/200");

                addBook(bookRepository, "Ikigai", "Hector Garcia",
                    "The Japanese secret to a long and happy life.", 299.0,
                    "https://picsum.photos/id/89/300/200");

                addBook(bookRepository, "The Subtle Art of Not Giving a F*ck", "Mark Manson",
                    "A counterintuitive approach to living a good life.", 349.0,
                    "https://picsum.photos/id/103/300/200");

                addBook(bookRepository, "1984", "George Orwell",
                    "A dystopian novel about totalitarianism and surveillance.", 179.0,
                    "https://picsum.photos/id/117/300/200");

                addBook(bookRepository, "To Kill a Mockingbird", "Harper Lee",
                    "A story of racial injustice and moral growth in the American South.", 229.0,
                    "https://picsum.photos/id/129/300/200");

                addBook(bookRepository, "The Great Gatsby", "F. Scott Fitzgerald",
                    "A tale of wealth, obsession, and the American Dream.", 199.0,
                    "https://picsum.photos/id/143/300/200");

                addBook(bookRepository, "Man's Search for Meaning", "Viktor Frankl",
                    "A psychiatrist's memoir of surviving Nazi death camps.", 259.0,
                    "https://picsum.photos/id/160/300/200");

                addBook(bookRepository, "The Power of Now", "Eckhart Tolle",
                    "A guide to spiritual enlightenment and living in the present.", 319.0,
                    "https://picsum.photos/id/177/300/200");

                addBook(bookRepository, "Zero to One", "Peter Thiel",
                    "Notes on startups and how to build the future.", 399.0,
                    "https://picsum.photos/id/188/300/200");

                addBook(bookRepository, "Thinking, Fast and Slow", "Daniel Kahneman",
                    "Explores the two systems that drive the way we think.", 469.0,
                    "https://picsum.photos/id/219/300/200");

                addBook(bookRepository, "The Lean Startup", "Eric Ries",
                    "How today's entrepreneurs use continuous innovation.", 389.0,
                    "https://picsum.photos/id/225/300/200");

                addBook(bookRepository, "Meditations", "Marcus Aurelius",
                    "Personal writings of the Roman Emperor on Stoic philosophy.", 219.0,
                    "https://picsum.photos/id/243/300/200");

                addBook(bookRepository, "The Midnight Library", "Matt Haig",
                    "A novel about all the lives you could have lived.", 329.0,
                    "https://picsum.photos/id/256/300/200");

                addBook(bookRepository, "Educated", "Tara Westover",
                    "A memoir about a woman who grows up in a survivalist family.", 359.0,
                    "https://picsum.photos/id/271/300/200");

                addBook(bookRepository, "The 48 Laws of Power", "Robert Greene",
                    "A guide to power, strategy, and human nature.", 499.0,
                    "https://picsum.photos/id/288/300/200");

                addBook(bookRepository, "How to Win Friends and Influence People", "Dale Carnegie",
                    "Timeless advice on communication and human relations.", 279.0,
                    "https://picsum.photos/id/306/300/200");

                System.out.println("✅ 23 books loaded into database!");
            }
        };
    }

    // Helper method to keep code clean
    private void addBook(BookRepository repo, String title, String author,
                         String description, double price, String imageUrl) {
        Book b = new Book();
        b.setTitle(title);
        b.setAuthor(author);
        b.setDescription(description);
        b.setPrice(price);
        b.setImageUrl(imageUrl);
        repo.save(b);
    }
}