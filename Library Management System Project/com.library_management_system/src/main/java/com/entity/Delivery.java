package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 * Represents a Delivery entity in the system.
 * This class maps to a database table and contains fields for delivery details,
 * including a reference to the associated order.
 */
@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID value
    private Long deliveryId; // Unique identifier for the delivery

    @OneToOne // A delivery is associated with one order
    @JoinColumn(name = "order_id") // Foreign key column in the Delivery table linking to the Order table
    private Order order; // Reference to the associated Order entity

    private String address; // Delivery address

    // No-argument constructor (required by Hibernate for entity instantiation)
    public Delivery() {}

    // Constructor that accepts parameters to initialize the Delivery object
    public Delivery(Order order, String address) {
        this.order = order; // Initialize the associated Order reference
        this.address = address; // Initialize the delivery address
    }

    // Getters and Setters
    public Long getDeliveryId() {
        return deliveryId; // Return the unique ID of the delivery
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId; // Set the unique ID of the delivery
    }

    public Order getOrder() {
        return order; // Return the associated Order entity
    }

    public void setOrder(Order order) {
        this.order = order; // Set the associated Order entity
    }

    public String getAddress() {
        return address; // Return the delivery address
    }

    public void setAddress(String address) {
        this.address = address; // Set the delivery address
    }
}
