package com.dmitrievigor.petproject.service;

import com.dmitrievigor.petproject.dao.PizzaDAO;

import com.dmitrievigor.petproject.entity.pizza.TypesPizzas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class PizzaServiceIplm implements PizzaService{
    @Autowired
    PizzaDAO pizzaDAO;
    @Transactional
    @Override
    public List<TypesPizzas> getAllPizzas() {
        return pizzaDAO.getAllPizzas();
    }
}
