package com.dmitrievigor.petproject.entity.pizza.toppings;

import com.dmitrievigor.petproject.entity.pizza.Pizza;

public class DoubleMashrooms extends Pizza {
    Pizza pizza;

    public DoubleMashrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() +" + двойные грибы";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+0.2;
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
