package com.dmitrievigor.petproject.dao;



import com.dmitrievigor.petproject.entity.pizza.TypesPizzas;

import java.util.List;

public interface PizzaDAO {
    public List<TypesPizzas>getAllPizzas();
}
