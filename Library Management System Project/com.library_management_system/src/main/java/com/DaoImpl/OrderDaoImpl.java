package com.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Dao.OrderDao;
import com.entity.Order;

/**
 * Implementation of the OrderDao interface.
 * This class provides methods to perform CRUD operations for Order entities.
 */
public class OrderDaoImpl implements OrderDao {
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
    public void saveOrder(Order order) {
        Transaction transaction = null; // Declare a transaction variable
        try (Session session = sessionFactory.openSession()) { // Open a new session
            transaction = session.beginTransaction(); // Begin a transaction
            session.save(order); // Save the Order entity
            transaction.commit(); // Commit the transaction
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback if an error occurs
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}
