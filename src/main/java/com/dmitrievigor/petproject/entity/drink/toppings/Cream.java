package com.dmitrievigor.petproject.entity.drink.toppings;

import com.dmitrievigor.petproject.entity.drink.Drink;

import java.math.BigDecimal;

public class Cream extends Drink {
    Drink drink;

    public Cream(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + взбитые сливки";
    }

    @Override
    public double getCost() {
        return drink.getCost() + 0.3;
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
