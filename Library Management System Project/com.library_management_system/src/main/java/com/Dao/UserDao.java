package com.Dao;

import com.entity.User;

/**
 * Interface for User Data Access Object (DAO).
 * This interface provides methods to interact with User entities in the data layer.
 */
public interface UserDao {
    
    /**
     * Saves a new User entity to the database.
     *
     * @param user the User entity to be saved
     */
    void saveUser(User user);
    
    /**
     * Retrieves a User entity by its email address.
     *
     * @param email the email address of the User to be retrieved
     * @return the User entity associated with the given email, or null if not found
     */
    User getUserByEmail(String email);
    
    /**
     * Retrieves a User entity by its unique ID.
     *
     * @param id the unique identifier of the User to be retrieved
     * @return the User entity associated with the given ID, or null if not found
     */
    User getUserById(Long id);
}

