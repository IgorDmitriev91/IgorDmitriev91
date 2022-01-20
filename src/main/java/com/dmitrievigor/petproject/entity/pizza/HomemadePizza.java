package com.dmitrievigor.petproject.entity.pizza;

public class HomemadePizza extends Pizza{
    private String size;
    private double cost = 2.2;

    public HomemadePizza() {

    }


    @Override
    public String getDescription() {
        return "Домашняя пицца";
    }

    @Override
    public double getCost() {
        if (size.equals("small")) {
            return cost-0.2;
        }
        else if(size.equals("medium")){
            return cost;
        }
        else return cost +0.6;

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
