package com.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.Dao.AdminDao;
import com.entity.Admin;

/**
 * Implementation of the AdminDao interface.
 * This class provides methods to perform CRUD operations for Admin entities.
 */
public class AdminDaoImpl implements AdminDao {
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
    public void saveAdmin(Admin admin) {
        Transaction transaction = null; // Declare a transaction variable
        try (Session session = sessionFactory.openSession()) { // Open a new session
            transaction = session.beginTransaction(); // Begin a transaction
            session.save(admin); // Save the Admin entity
            transaction.commit(); // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback if an error occurs
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }

    @Override
    public Admin getAdminByEmail(String email) {
        try (Session session = sessionFactory.openSession()) { // Open a new session
            // Query the database for an Admin with the given email
            return session.createQuery("FROM Admin WHERE email = :email", Admin.class)
                    .setParameter("email", email) // Set the email parameter
                    .uniqueResult(); // Return the unique result
        }
    }

    @Override
    public Admin getAdminById(Long id) {
        try (Session session = sessionFactory.openSession()) { // Open a new session
            // Retrieve the Admin entity by its ID
            return session.get(Admin.class, id); // Return the Admin entity
        }
    }
}
