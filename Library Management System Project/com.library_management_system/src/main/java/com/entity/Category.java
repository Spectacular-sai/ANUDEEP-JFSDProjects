package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a Category entity in the system.
 * This class maps to a database table and contains fields for category details.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID value
    private Long categoryId; // Unique identifier for the category

    private String categoryName; // Name of the category

    // No-argument constructor (required by Hibernate for entity instantiation)
    public Category() {}

    // Constructor that accepts a category name to initialize the Category object
    public Category(String categoryName) {
        this.categoryName = categoryName; // Initialize the category name
    }

    // Getters and Setters
    public Long getCategoryId() {
        return categoryId; // Return the unique ID of the category
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId; // Set the unique ID of the category
    }

    public String getCategoryName() {
        return categoryName; // Return the name of the category
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName; // Set the name of the category
    }

    // Method to retrieve the category name (alternative to getCategoryName)
    public String getName() {
        return categoryName; // Return the categoryName field
    }
}
