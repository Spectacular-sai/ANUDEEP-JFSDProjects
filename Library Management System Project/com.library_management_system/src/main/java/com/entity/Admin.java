package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents an Admin entity in the system.
 * This class maps to a database table and contains fields for admin details.
 */
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID value
    private Long adminId; // Unique identifier for the admin

    private String email; // Admin's email address
    private String username; // Admin's username
    private String password; // Admin's password

    // Default constructor
    public Admin() {}

    // Parameterized constructor for initializing Admin object
    public Admin(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public Long getAdminId() {
        return adminId; // Return the admin ID
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId; // Set the admin ID
    }

    public String getEmail() {
        return email; // Return the email
    }

    public void setEmail(String email) {
        this.email = email; // Set the email
    }

    public String getUsername() {
        return username; // Return the username
    }

    public void setUsername(String username) {
        this.username = username; // Set the username
    }

    public String getPassword() {
        return password; // Return the password
    }

    public void setPassword(String password) {
        this.password = password; // Set the password
    }
}
