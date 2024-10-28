package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a User entity in the system.
 * This class maps to a database table and contains fields for user details,
 * including personal information and contact details.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID value
    private Long userId; // Unique identifier for the user

    private String name; // Name of the user
    private String email; // Email address of the user
    private String phone; // Phone number of the user
    private String password; // Password for user authentication
    private String address; // Physical address of the user

    // No-argument constructor (required by Hibernate for entity instantiation)
    public User() {}

    // Constructor that accepts parameters to initialize the User object
    public User(String name, String email, String phone, String password, String address) {
        this.name = name; // Initialize the user's name
        this.email = email; // Initialize the user's email
        this.phone = phone; // Initialize the user's phone number
        this.password = password; // Initialize the user's password
        this.address = address; // Initialize the user's address
    }

    // Getters and Setters
    public Long getUserId() {
        return userId; // Return the unique ID of the user
    }

    public void setUserId(Long userId) {
        this.userId = userId; // Set the unique ID of the user
    }

    public String getName() {
        return name; // Return the name of the user
    }

    public void setName(String name) {
        this.name = name; // Set the name of the user
    }

    public String getEmail() {
        return email; // Return the email of the user
    }

    public void setEmail(String email) {
        this.email = email; // Set the email of the user
    }

    public String getPhone() {
        return phone; // Return the phone number of the user
    }

    public void setPhone(String phone) {
        this.phone = phone; // Set the phone number of the user
    }

    public String getPassword() {
        return password; // Return the password of the user
    }

    public void setPassword(String password) {
        this.password = password; // Set the password of the user
    }

    public String getAddress() {
        return address; // Return the address of the user
    }

    public void setAddress(String address) {
        this.address = address; // Set the address of the user
    }
}
