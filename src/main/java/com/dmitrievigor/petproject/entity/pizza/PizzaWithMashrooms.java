package com.dmitrievigor.petproject.entity.pizza;

public class PizzaWithMashrooms extends Pizza{
    private String size;
    private double cost = 3;

    public PizzaWithMashrooms() {
    }

    public PizzaWithMashrooms(String size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Пицца с грибами";
    }

    @Override
    public double getCost() {
        if (size.equals("small")) {
            return cost-0.2;
        }
        else if(size.equals("medium")){
            return cost;
        }
        else return cost + 0.5;

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
