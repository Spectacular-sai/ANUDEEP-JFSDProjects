package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents an Order entity in the system.
 * This class maps to a database table and contains fields for order details,
 * including references to the associated user and book.
 */
@Entity
@Table(name = "BookOrder") // Specify the name of the database table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID value
    private Long orderId; // Unique identifier for the order

    @ManyToOne // Many orders can belong to one user
    @JoinColumn(name = "user_id") // Foreign key column in the Order table linking to the User table
    private User user; // Reference to the associated User entity

    @ManyToOne // Many orders can include one book
    @JoinColumn(name = "book_id") // Foreign key column in the Order table linking to the Book table
    private Book book; // Reference to the associated Book entity

    private String orderDate; // Date when the order was placed

    // No-argument constructor (required by Hibernate for entity instantiation)
    public Order() {}

    // Constructor that accepts parameters to initialize the Order object
    public Order(User user, Book book, String orderDate) {
        this.user = user; // Initialize the associated User reference
        this.book = book; // Initialize the associated Book reference
        this.orderDate = orderDate; // Initialize the order date
    }

    // Getters and Setters
    public Long getOrderId() {
        return orderId; // Return the unique ID of the order
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId; // Set the unique ID of the order
    }

    public User getUser() {
        return user; // Return the associated User entity
    }

    public void setUser(User user) {
        this.user = user; // Set the associated User entity
    }

    public Book getBook() {
        return book; // Return the associated Book entity
    }

    public void setBook(Book book) {
        this.book = book; // Set the associated Book entity
    }

    public String getOrderDate() {
        return orderDate; // Return the order date
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate; // Set the order date
    }
}
