package com.Dao;

import com.entity.Delivery;

/**
 * Interface for Delivery Data Access Object (DAO).
 * This interface provides methods to interact with Delivery entities in the data layer.
 */
public interface DeliveryDao {
    
    /**
     * Saves a new Delivery entity to the database.
     *
     * @param delivery the Delivery entity to be saved
     */
    void saveDelivery(Delivery delivery);
}

