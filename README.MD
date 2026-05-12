# 📚 PeaceOfMind — Online Bookstore

A full-stack online bookstore web application built with **Spring Boot** and **vanilla JavaScript**, featuring a premium dark-gold UI, REST API backend, and session-based shopping cart.

---

## 🖥️ Tech Stack

| Layer | Technology |
|---|---|
| Backend | Java 17, Spring Boot 3.4.5 |
| Database | H2 In-Memory, Hibernate ORM |
| ORM | Spring Data JPA |
| Frontend | HTML5, CSS3, JavaScript (Fetch API) |
| Build Tool | Maven |
| Server | Apache Tomcat (embedded) |

---

## ✨ Features

- 📖 Browse 23 books in a responsive grid layout
- 🔍 Real-time search by title, author, or description
- 🛒 Session-based shopping cart (add, remove, quantity tracking)
- 📄 Individual book detail pages
- 💳 Checkout flow with order confirmation
- 🔑 Login and Sign Up pages
- 🎨 Premium dark-gold UI with smooth CSS animations
- 📱 Fully responsive design for mobile and desktop

---

## 📁 Project Structure

```
bookstore/
├── src/
│   └── main/
│       ├── java/com/bookstore/
│       │   ├── bookstore/
│       │   │   └── BookstoreApplication.java   # Main entry point
│       │   ├── controller/
│       │   │   ├── BookController.java          # Book REST APIs
│       │   │   └── CartController.java          # Cart REST APIs
│       │   ├── model/
│       │   │   ├── Book.java                    # Book entity
│       │   │   └── CartItem.java                # Cart item model
│       │   ├── repository/
│       │   │   └── BookRepository.java          # JPA repository
│       │   ├── service/
│       │   │   └── BookService.java             # Business logic
│       │   └── config/
│       │       └── DataLoader.java              # Seeds 23 books on startup
│       └── resources/
│           ├── application.properties           # App configuration
│           └── static/                          # Frontend files
│               ├── index.html                   # Home page
│               ├── book-details.html            # Book detail page
│               ├── cart.html                    # Shopping cart
│               ├── confirmation.html            # Order confirmation
│               ├── login.html                   # Login page
│               ├── signup.html                  # Sign up page
│               └── styles.css                   # Premium CSS
└── pom.xml                                      # Maven dependencies
```

---

## 🚀 Getting Started

### Prerequisites

Make sure you have these installed:

- **Java 17+** → [Download](https://adoptium.net/)
- **Maven 3.6+** → [Download](https://maven.apache.org/download.cgi)

Verify installation:
```bash
java -version
mvn -version
```

### Run the Application

**Step 1 — Clone or download the project**
```bash
cd C:\Users\YourName\Desktop\bookstore
```

**Step 2 — Build and run**
```bash
mvn clean spring-boot:run
```

**Step 3 — Open in browser**
```
http://localhost:8080
```

> ⚠️ Keep the terminal open while using the app. The server runs only while the terminal is active.

---

## 🌐 Pages & URLs

| Page | URL |
|---|---|
| 🏠 Home (Book Grid) | `http://localhost:8080` |
| 📖 Book Details | `http://localhost:8080/book-details.html?id=1` |
| 🛒 Shopping Cart | `http://localhost:8080/cart.html` |
| ✅ Order Confirmation | `http://localhost:8080/confirmation.html` |
| 🔑 Login | `http://localhost:8080/login.html` |
| 📝 Sign Up | `http://localhost:8080/signup.html` |
| 🗄️ H2 Database Console | `http://localhost:8080/h2-console` |

---

## 🔌 REST API Endpoints

### Books
| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/books` | Get all books |
| `GET` | `/api/books/{id}` | Get book by ID |

### Cart
| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/cart` | Get all cart items |
| `POST` | `/api/cart?bookId={id}` | Add book to cart |
| `DELETE` | `/api/cart/{bookId}` | Remove book from cart |

---

## 🗄️ Database

This project uses **H2 In-Memory Database** — no installation required.

- Database is created automatically when the app starts
- 23 books are seeded automatically via `DataLoader.java`
- Data is reset every time the app restarts

**Access H2 Console:**
```
URL:      http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:bookstoredb
Username: sa
Password: (leave empty)
```

---

## ⚙️ Configuration

`src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:h2:mem:bookstoredb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver

spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.open-in-view=false

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## 🏗️ Architecture

```
Browser (HTML + JS)
        ↓  HTTP Fetch API
REST Controllers  (BookController, CartController)
        ↓
Service Layer     (BookService)
        ↓
Repository Layer  (BookRepository - Spring Data JPA)
        ↓
H2 In-Memory Database  (Hibernate manages schema)
```

---

## 📦 Maven Dependencies

| Dependency | Purpose |
|---|---|
| `spring-boot-starter-web` | REST API + embedded Tomcat |
| `spring-boot-starter-data-jpa` | JPA + Hibernate ORM |
| `h2` | In-memory database |
| `lombok` | Reduces boilerplate code |
| `spring-boot-devtools` | Auto-restart on code changes |
| `spring-boot-starter-test` | Unit testing |

---

## 🎨 UI Design

- **Theme** — Dark obsidian background with warm gold accents
- **Fonts** — Cormorant Garamond (display) + Jost (body)
- **Animations** — Page fade-in, hover glow effects, floating book images, shimmer header
- **Responsive** — Mobile-first grid layout using CSS Grid

---

## 🔮 Future Improvements

- [ ] Connect to MySQL or PostgreSQL for persistent data
- [ ] Add JWT-based authentication
- [ ] Implement order history and user profiles
- [ ] Add book categories and filter by genre
- [ ] Deploy to AWS / Railway / Render
- [ ] Add payment gateway integration
- [ ] Write unit and integration tests

---

## 👨‍💻 Author

**Shreyas**
Built with Java, Spring Boot, and a lot of debugging 💪

---

## 📄 License

This project is for educational purposes.