package com.hibernate.sample.webapp.dao;

import com.hibernate.sample.webapp.model.ContractEmployee;
import com.hibernate.sample.webapp.model.Employee;
import com.hibernate.sample.webapp.model.RegularEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {

    public static void tablePerHierarchy() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(new Employee("Vijay"));
        session.persist(new RegularEmployee("Vijay", 400000, 120000));
        session.persist(new ContractEmployee("Vijay", 120.00, "2 years"));

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
