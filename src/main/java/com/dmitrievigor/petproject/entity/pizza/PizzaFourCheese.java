package com.dmitrievigor.petproject.entity.pizza;

public class PizzaFourCheese extends Pizza{
    private String size;
    private double cost = 2.5;

    public PizzaFourCheese() {
    }

    public PizzaFourCheese(String size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Пицца четыре сыра";
    }

    @Override
    public double getCost() {
        if (size.equals("small")) {
            return cost-0.2;
        }
        else if(size.equals("medium")){
            return cost;
        }
        else return cost + 0.7;

    }

    @Override
    public String getSize() {
        return size;
    }



    @Override
    public void setSize(String size) {
        this.size = size;
    }
}
