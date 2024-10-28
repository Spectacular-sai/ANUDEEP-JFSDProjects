package com.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Dao.CategoryDao;
import com.entity.Category;

/**
 * Implementation of the CategoryDao interface.
 * This class provides methods to perform CRUD operations for Category entities.
 */
public class CategoryDaoImpl implements CategoryDao {
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
    public void saveCategory(Category category) {
        Transaction transaction = null; // Declare a transaction variable
        try (Session session = sessionFactory.openSession()) { // Open a new session
            transaction = session.beginTransaction(); // Begin a transaction
            session.save(category); // Save the Category entity
            transaction.commit(); // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback if an error occurs
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }

    @Override
    public Category getCategoryById(Long id) {
        try (Session session = sessionFactory.openSession()) { // Open a new session
            return session.get(Category.class, id); // Retrieve and return the Category entity by its ID
        }
    }

    @Override
    public List<Category> getAllCategories() {
        try (Session session = sessionFactory.openSession()) { // Open a new session
            // Query the database for all Category entities
            return session.createQuery("from Category", Category.class).list(); // Return the list of all categories
        }
    }
}
