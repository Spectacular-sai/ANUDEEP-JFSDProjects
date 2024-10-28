package com.lms.com.library_management_system;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.DaoImpl.AdminDaoImpl;
import com.DaoImpl.BookDaoImpl;
import com.DaoImpl.CategoryDaoImpl;
import com.DaoImpl.DeliveryDaoImpl;
import com.DaoImpl.OrderDaoImpl;
import com.DaoImpl.UserDaoImpl;
import com.entity.Admin;
import com.entity.Book;
import com.entity.Category;
import com.entity.Delivery;
import com.entity.Order;
import com.entity.User;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

    // DAO implementations for accessing the database
    private static UserDaoImpl userDao = new UserDaoImpl();
    private static AdminDaoImpl adminDao = new AdminDaoImpl();
    private static BookDaoImpl bookDao = new BookDaoImpl();
    private static CategoryDaoImpl categoryDao = new CategoryDaoImpl();
    private static OrderDaoImpl orderDao = new OrderDaoImpl();
    private static DeliveryDaoImpl deliveryDao = new DeliveryDaoImpl();
    private static Scanner scanner = new Scanner(System.in); // Scanner for user input

    public static void main(String[] args) {
        // Create SessionFactory for Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
        // Set the session factory for each DAO implementation
        userDao.setSessionFactory(sessionFactory);
        adminDao.setSessionFactory(sessionFactory);
        bookDao.setSessionFactory(sessionFactory);
        categoryDao.setSessionFactory(sessionFactory);
        orderDao.setSessionFactory(sessionFactory);
        deliveryDao.setSessionFactory(sessionFactory);

        try {
            while (true) {
                displayMainMenu(); // Display the main menu
                int choice = getUserChoice(); // Get user's menu choice

                switch (choice) {
                    case 1:
                        userLoginOrRegister(); // Handle user login or registration
                        break;
                    case 2:
                        adminLoginOrRegister(); // Handle admin login or registration
                        break;
                    case 3:
                        System.out.println("Exiting..."); // Exit the application
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again."); // Handle invalid input
                }
            }
        } finally {
            sessionFactory.close(); // Close the session factory
            scanner.close(); // Close the scanner
        }
    }

    // Display the main menu options
    private static void displayMainMenu() {
        System.out.println("Welcome to the Library Management System");
        System.out.println("1. User Login/Register");
        System.out.println("2. Admin Login/Register");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    // Get the user's choice from the menu
    private static int getUserChoice() {
        try {
            return scanner.nextInt(); // Read the user's input
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear invalid input
            System.out.println("Invalid input. Please enter a number."); // Error message
            return -1; // Return an invalid choice
        }
    }

    // Logic for user login and registration
    private static void userLoginOrRegister() {
        System.out.print("Enter email: ");
        String email = scanner.next(); // Get user email
        System.out.print("Enter password: ");
        String password = scanner.next(); // Get user password

        // Check if the user exists
        User user = userDao.getUserByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful! Welcome " + user.getName());
            userActions(user); // Proceed to user actions
        } else {
            System.out.println("User not found. Creating a new account."); // Register new user
            addUser(email, password); // Call method to add user
        }
    }

    // User actions after successful login
    private static void userActions(User user) {
        while (true) {
            System.out.println("\nUser Actions:");
            System.out.println("1. View Available Books");
            System.out.println("2. Browse Books by Category");
            System.out.println("3. Place an Order");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int choice = getUserChoice(); // Get user's choice

            switch (choice) {
                case 1:
                    viewAllBooks(); // Display all available books
                    break;
                case 2:
                    viewBooksByCategory(); // Browse books by category
                    break;
                case 3:
                    placeOrder(user); // Place an order
                    break;
                case 4:
                    return; // Logout
                default:
                    System.out.println("Invalid choice. Please try again."); // Handle invalid choice
            }
        }
    }

    // Display all available books
    private static void viewAllBooks() {
        List<Book> books = bookDao.getAllBooks(); // Get all books from database
        if (books.isEmpty()) {
            System.out.println("No books available."); // No books found
        } else {
            System.out.println("Available Books:");
            for (Book book : books) {
                System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    // View books by category
    private static void viewBooksByCategory() {
        List<Category> categories = categoryDao.getAllCategories(); // Get all categories
        if (categories.isEmpty()) {
            System.out.println("No categories available."); // No categories found
        } else {
            System.out.println("Available Categories and Books:");
            for (Category category : categories) {
                System.out.println("Category: " + category.getName());
                List<Book> books = bookDao.getBooksByCategory(category); // Get books for each category
                if (books.isEmpty()) {
                    System.out.println("  No books available in this category.");
                } else {
                    for (Book book : books) {
                        System.out.println("  Book: " + book.getTitle() + " by " + book.getAuthor());
                    }
                }
            }
        }
    }

    // Place an order for a book
    private static void placeOrder(User user) {
        System.out.print("Enter book ID: ");
        Long bookId = scanner.nextLong(); // Get book ID from user
        Book book = bookDao.getBookById(bookId); // Find book by ID

        if (book == null) {
            System.out.println("Book not found. Order not placed."); // Handle book not found
            return;
        }

        System.out.print("Enter order date (YYYY-MM-DD): ");
        String orderDate = scanner.next(); // Get order date

        // Create and save the order
        Order order = new Order(user, book, orderDate);
        orderDao.saveOrder(order);
        System.out.println("Order placed successfully!");

        // Create and save the delivery details
        Delivery delivery = new Delivery(order, user.getAddress());
        deliveryDao.saveDelivery(delivery);
        System.out.println("Delivery details saved successfully!");
    }

    // Logic for admin login and registration
    private static void adminLoginOrRegister() {
        System.out.print("Enter email: ");
        String email = scanner.next(); // Get admin email
        System.out.print("Enter password: ");
        String password = scanner.next(); // Get admin password

        Admin admin = adminDao.getAdminByEmail(email); // Check if admin exists

        if (admin != null && admin.getPassword().equals(password)) {
            System.out.println("Admin login successful! Welcome " + admin.getUsername());
            adminActions(); // Proceed to admin actions
        } else {
            System.out.println("Admin not found. Creating a new admin account."); // Register new admin
            addAdmin(email, password); // Call method to add admin
        }
    }

    // Admin actions after successful login
    private static void adminActions() {
        while (true) {
            System.out.println("\nAdmin Actions:");
            System.out.println("1. Add Category");
            System.out.println("2. Add Book");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = getUserChoice(); // Get admin's choice

            switch (choice) {
                case 1:
                    addCategory(); // Add a new category
                    break;
                case 2:
                    addBook(); // Add a new book
                    break;
                case 3:
                    return; // Logout
                default:
                    System.out.println("Invalid choice. Please try again."); // Handle invalid choice
            }
        }
    }

    // Method to add a new user
    private static void addUser(String email, String password) {
        System.out.print("Enter name: ");
        String name = scanner.next(); // Get user name
        System.out.print("Enter phone number: ");
        String phone = scanner.next(); // Get user phone number
        System.out.print("Enter address: ");
        String address = scanner.next(); // Get user address

        User user = new User(name, email, phone, password, address); // Create a new User object
        userDao.saveUser(user); // Save user to database
        System.out.println("User account created successfully!");
    }

    // Method to add a new admin
    private static void addAdmin(String email, String password) {
        System.out.print("Enter username: ");
        String username = scanner.next(); // Get admin username
        Admin admin = new Admin(email, username, password); // Create a new Admin object
        adminDao.saveAdmin(admin); // Save admin to database
        System.out.println("Admin account created successfully!");
    }

    // Method to add a new category
    private static void addCategory() {
        System.out.print("Enter category name: ");
        String categoryName = scanner.next(); // Get category name

        Category category = new Category(categoryName); // Create a new Category object
        categoryDao.saveCategory(category); // Save category to database
        System.out.println("Category added successfully!");
    }

    // Method to add a new book
    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.next(); // Get book title
        System.out.print("Enter author name: ");
        String author = scanner.next(); // Get author name
        System.out.print("Enter publisher name: ");
        String publisher = scanner.next(); // Get publisher name

        System.out.print("Enter category ID: ");
        long categoryId;

        try {
            categoryId = scanner.nextLong(); // Get category ID
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for the category ID."); // Handle invalid input
            scanner.nextLine(); // Clear the invalid input
            return;
        }

        Category category = categoryDao.getCategoryById(categoryId); // Find category by ID
        if (category == null) {
            System.out.println("Category not found. Book cannot be added."); // Handle category not found
            return;
        }

        Book book = new Book(title, author, publisher, category); // Create a new Book object
        bookDao.saveBook(book); // Save book to database
        System.out.println("Book added successfully!");
    }
}
