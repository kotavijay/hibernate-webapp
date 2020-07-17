package com.hibernate.sample.webapp.dao;

import com.hibernate.sample.webapp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {
    public static Long registerUser(User user) {
        Long i = 0L;

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        i = (Long) session.save(user);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return i;
    }
}
