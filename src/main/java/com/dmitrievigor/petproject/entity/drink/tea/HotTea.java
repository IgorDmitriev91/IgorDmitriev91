package com.dmitrievigor.petproject.entity.drink.tea;

import com.dmitrievigor.petproject.entity.drink.Drink;

import java.math.BigDecimal;

public class HotTea extends Drink {
    private String size;
    private double cost = 1.0;

    public HotTea() {
    }

    @Override
    public String getDescription() {
        return "Горячий чай";
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
