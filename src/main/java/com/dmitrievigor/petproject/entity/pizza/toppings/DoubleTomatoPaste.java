package com.dmitrievigor.petproject.entity.pizza.toppings;

import com.dmitrievigor.petproject.entity.pizza.Pizza;

public class DoubleTomatoPaste extends Pizza {
    Pizza pizza;

    public DoubleTomatoPaste(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + двойная томатная паста";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+0.3;
    }

    @Override
    public String getSize() {
        return pizza.getSize();
    }

    @Override
    public void setSize(String size) {
        pizza.setSize(size);
    }

}
