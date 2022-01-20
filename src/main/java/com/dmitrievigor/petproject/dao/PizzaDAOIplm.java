package com.dmitrievigor.petproject.dao;


import com.dmitrievigor.petproject.entity.pizza.TypesPizzas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PizzaDAOIplm implements PizzaDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<TypesPizzas> getAllPizzas() {
        Session session = sessionFactory.getCurrentSession();
        List<TypesPizzas>allPizas =session.createQuery("from TypesPizzas "
                        ,TypesPizzas.class).getResultList();

        return allPizas;
    }


    }

