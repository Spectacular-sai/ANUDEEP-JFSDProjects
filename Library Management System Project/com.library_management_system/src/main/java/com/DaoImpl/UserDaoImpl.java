package com.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.User;

/**
 * Implementation of User Data Access Object (DAO).
 * This class provides methods to perform CRUD operations for User entities.
 */
public class UserDaoImpl {
    private SessionFactory sessionFactory;

    /**
     * Sets the SessionFactory for Hibernate.
     *
     * @param sessionFactory the SessionFactory to be set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Saves a new User entity to the database.
     *
     * @param user the User entity to be saved
     */
    public void saveUser(User user) {
        Transaction transaction = null; // Declare a transaction variable
        try (Session session = sessionFactory.openSession()) { // Open a new session
            transaction = session.beginTransaction(); // Begin a transaction
            session.save(user); // Save the User entity
            transaction.commit(); // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback if an error occurs
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }

    /**
     * Retrieves a User entity by its email address.
     *
     * @param email the email address of the User to be retrieved
     * @return the User entity associated with the given email, or null if not found
     */
    public User getUserByEmail(String email) {
        try (Session session = sessionFactory.openSession()) { // Open a new session
            // Query the database for a User with the given email
            return session.createQuery("FROM User WHERE email = :email", User.class)
                    .setParameter("email", email) // Set the email parameter
                    .uniqueResult(); // Return the unique result
        }
    }

    /**
     * Retrieves a User entity by its unique ID.
     *
     * @param id the unique identifier of the User to be retrieved
     * @return the User entity associated with the given ID, or null if not found
     */
    public User getUserById(Long id) {
        try (Session session = sessionFactory.openSession()) { // Open a new session
            return session.get(User.class, id); // Retrieve and return the User entity by its ID
        }
    }
}
