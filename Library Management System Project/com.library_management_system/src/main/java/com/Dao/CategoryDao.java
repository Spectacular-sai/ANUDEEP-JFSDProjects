package com.Dao;

import java.util.List;
import com.entity.Category;

/**
 * Interface for Category Data Access Object (DAO).
 * This interface provides methods to interact with Category entities in the data layer.
 */
public interface CategoryDao {
    
    /**
     * Saves a new Category entity to the database.
     *
     * @param category the Category entity to be saved
     */
    void saveCategory(Category category);
    
    /**
     * Retrieves a Category entity by its unique ID.
     *
     * @param id the unique identifier of the Category to be retrieved
     * @return the Category entity associated with the given ID, or null if not found
     */
    Category getCategoryById(Long id);
    
    /**
     * Retrieves a list of all Category entities in the database.
     *
     * @return a List of all Category entities
     */
    List<Category> getAllCategories();
}
