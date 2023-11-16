package com.javarush.dao;

import com.javarush.entity.Country;
import org.hibernate.SessionFactory;

import java.util.List;
import org.hibernate.query.Query;
public class CountryDAO {
    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public List<Country> getAll() {

        Query<Country> queue = sessionFactory.getCurrentSession().createQuery("select c from Country c join fetch c.languages", Country.class);
        return queue.list();
    }
}
