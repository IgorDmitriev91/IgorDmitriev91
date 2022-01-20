package com.dmitrievigor.petproject.dao;

import com.dmitrievigor.petproject.entity.drink.TypesDrinks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


    @Repository
    public  class DrinkDAOImpl implements DrinkDAO{
        @Autowired
        private SessionFactory sessionFactory;
        @Override
        public List<TypesDrinks> getAllDrinks() {
            Session session = sessionFactory.getCurrentSession();
            List<TypesDrinks>allDrinks = session.createQuery("from TypesDrinks",
                    TypesDrinks.class).getResultList();

            return allDrinks;
        }
    }

