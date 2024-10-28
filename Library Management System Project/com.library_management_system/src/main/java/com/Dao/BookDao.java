package com.Dao;

import java.util.List;
import com.entity.Book;

/**
 * Interface for Book Data Access Object (DAO).
 * This interface provides methods to interact with Book entities in the data layer.
 */
public interface BookDao {
    
    /**
     * Saves a new Book entity to the database.
     *
     * @param book the Book entity to be saved
     */
    void saveBook(Book book);
    
    /**
     * Retrieves a Book entity by its unique ID.
     *
     * @param id the unique identifier of the Book to be retrieved
     * @return the Book entity associated with the given ID, or null if not found
     */
    Book getBookById(Long id);
    
    /**
     * Retrieves a list of all Book entities in the database.
     *
     * @return a List of all Book entities
     */
    List<Book> getAllBooks();
}
