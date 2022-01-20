package com.dmitrievigor.petproject.service;

import com.dmitrievigor.petproject.dao.DrinkDAO;
import com.dmitrievigor.petproject.entity.drink.TypesDrinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DrinkServiceIpml implements DrinkService{
    @Autowired
    DrinkDAO drinkDAO;
    @Transactional
    @Override
    public List<TypesDrinks> getAllDrinks() {
        return drinkDAO.getAllDrinks();
    }
}
