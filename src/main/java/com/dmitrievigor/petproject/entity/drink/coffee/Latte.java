package com.dmitrievigor.petproject.entity.drink.coffee;

import com.dmitrievigor.petproject.entity.drink.Drink;

import java.math.BigDecimal;

public class Latte extends Drink {
    private String size;
    private double cost = 2.0;

    public Latte() {
    }

    @Override
    public String getDescription() {
        return "Латте";
    }

    @Override
    public double getCost() {
        if (size.equals("small")) {
            return cost;
        }
        else return cost +0.2;

    }


    @Override
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String getSize() {
        return size;
    }
}

