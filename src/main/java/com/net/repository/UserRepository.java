package com.net.repository;

import com.net.model.Customer;
import com.net.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<User> findByName() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query from_user = currentSession.createQuery("from User");
        return from_user.list();
    }

    @Transactional
    public void saveUser(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(user);
    }

    @Transactional
    public void saveCustomer(Customer customer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(customer);
    }

}
