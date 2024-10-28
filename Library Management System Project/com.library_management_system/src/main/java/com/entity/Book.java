package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Represents a Book entity in the system.
 * This class maps to a database table and contains fields for book details,
 * including a reference to its category.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID value
    private Long bookId; // Unique identifier for the book
    
    private String title; // Title of the book
    private String author; // Author of the book
    private String publisher; // Publisher of the book

    @ManyToOne // Many books can belong to one category
    @JoinColumn(name = "category_id") // Foreign key column in the Book table
    private Category category; // Reference to the Category entity

    // No-argument constructor (required by Hibernate)
    public Book() {
    }

    // Constructor that accepts parameters to initialize the Book object
    public Book(String title, String author, String publisher, Category category) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category; // Initialize the Category reference
    }

    // Getters and Setters
    public Long getBookId() {
        return bookId; // Return the book ID
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId; // Set the book ID
    }

    public String getTitle() {
        return title; // Return the title
    }

    public void setTitle(String title) {
        this.title = title; // Set the title
    }

    public String getAuthor() {
        return author; // Return the author
    }

    public void setAuthor(String author) {
        this.author = author; // Set the author
    }

    public String getPublisher() {
        return publisher; // Return the publisher
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher; // Set the publisher
    }

    public Category getCategory() {
        return category; // Return the associated category
    }

    public void setCategory(Category category) {
        this.category = category; // Set the associated category
    }
}
