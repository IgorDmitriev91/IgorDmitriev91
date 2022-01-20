package com.dmitrievigor.petproject.entity.drink.toppings;

import com.dmitrievigor.petproject.entity.drink.Drink;

import java.math.BigDecimal;

public class Syrup extends Drink {
    Drink drink;

    public Syrup(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + сироп";
    }

    @Override
    public double getCost() {
        return drink.getCost() + 0.2;
    }

    @Override
    public String getSize() {
        return drink.getSize();
    }

    @Override
    public void setSize(String size) {
        drink.setSize(size);
    }
}
