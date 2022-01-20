package com.dmitrievigor.petproject.entity.pizza.toppings;

import com.dmitrievigor.petproject.entity.pizza.Pizza;

public class DoubleCheese extends Pizza {
    Pizza pizza;

    public DoubleCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" + двойной сыр";
    }

    @Override
    public double getCost() {
        return  pizza.getCost() + 0.5;
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
