package com.Dao;

import com.entity.Admin;

/**
 * Interface for Admin Data Access Object (DAO).
 * This interface provides methods to interact with Admin entities in the data layer.
 */
public interface AdminDao {
    
    /**
     * Saves a new Admin entity to the database.
     *
     * @param admin the Admin entity to be saved
     */
    void saveAdmin(Admin admin);
    
    /**
     * Retrieves an Admin entity by its email address.
     *
     * @param email the email address of the Admin to be retrieved
     * @return the Admin entity associated with the given email, or null if not found
     */
    Admin getAdminByEmail(String email);
    
    /**
     * Retrieves an Admin entity by its unique ID.
     *
     * @param id the unique identifier of the Admin to be retrieved
     * @return the Admin entity associated with the given ID, or null if not found
     */
    Admin getAdminById(Long id);
}
