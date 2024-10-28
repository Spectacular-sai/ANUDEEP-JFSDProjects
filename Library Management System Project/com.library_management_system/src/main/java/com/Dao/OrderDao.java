package com.Dao;

import com.entity.Order;

/**
 * Interface for Order Data Access Object (DAO).
 * This interface provides methods to interact with Order entities in the data layer.
 */
public interface OrderDao {
    
    /**
     * Saves a new Order entity to the database.
     *
     * @param order the Order entity to be saved
     */
    void saveOrder(Order order);
}
