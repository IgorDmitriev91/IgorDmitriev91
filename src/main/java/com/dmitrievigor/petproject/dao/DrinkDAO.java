package com.dmitrievigor.petproject.dao;

import com.dmitrievigor.petproject.entity.drink.TypesDrinks;


import java.util.List;

public interface DrinkDAO {
     List<TypesDrinks> getAllDrinks();
}
