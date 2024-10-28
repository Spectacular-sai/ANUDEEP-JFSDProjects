package com.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Dao.BookDao;
import com.entity.Book;
import com.entity.Category;

/**
 * Implementation of the BookDao interface.
 * This class provides methods to perform CRUD operations for Book entities.
 */
public class BookDaoImpl implements BookDao {
    private SessionFactory sessionFactory;

    /**
     * Sets the SessionFactory for Hibernate.
     *
     * @param sessionFactory the SessionFactory to be set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveBook(Book book) {
        Transaction transaction = null; // Declare a transaction variable
        try (Session session = sessionFactory.openSession()) { // Open a new session
            transaction = session.beginTransaction(); // Begin a transaction
            session.save(book); // Save the Book entity
            transaction.commit(); // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback if an error occurs
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }

    @Override
    public Book getBookById(Long id) {
        try (Session session = sessionFactory.openSession()) { // Open a new session
            return session.get(Book.class, id); // Retrieve and return the Book entity by its ID
        }
    }

    @Override
    public List<Book> getAllBooks() {
        try (Session session = sessionFactory.openSession()) { // Open a new session
            // Query the database for all Book entities
            return session.createQuery("from Book", Book.class).list(); // Return the list of all books
        }
    }

    /**
     * Retrieves a list of books that belong to a specific category.
     *
     * @param category the Category entity to filter the books by
     * @return a List of Book entities that belong to the specified category
     */
    public List<Book> getBooksByCategory(Category category) {
        List<Book> books = null; // Initialize the list of books
        try (Session session = sessionFactory.openSession()) { // Open a new session
            // Use HQL to fetch books by category
            books = session.createQuery("FROM Book b WHERE b.category = :category", Book.class)
                           .setParameter("category", category) // Set the category parameter
                           .getResultList(); // Get the result list
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace for debugging
        }
        return books; // Return the list of books found
    }
}
