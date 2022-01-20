package com.dmitrievigor.petproject.service;


import com.dmitrievigor.petproject.entity.pizza.TypesPizzas;

import java.util.List;

public interface PizzaService {
    List<TypesPizzas> getAllPizzas();
}
