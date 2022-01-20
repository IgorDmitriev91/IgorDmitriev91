package com.dmitrievigor.petproject.entity.drink.toppings;

import com.dmitrievigor.petproject.entity.drink.Drink;

import java.math.BigDecimal;

public class Lemon extends Drink {
    Drink drink;

    public Lemon(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + лимон";
    }

    @Override
    public double getCost() {
        return drink.getCost() + 0.1;
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
