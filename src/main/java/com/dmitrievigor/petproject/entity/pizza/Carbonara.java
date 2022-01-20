package com.dmitrievigor.petproject.entity.pizza;

public class Carbonara extends Pizza {
    private String size;
    private double cost = 2.7;


    public Carbonara() {
    }

    public Carbonara(String size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Карбонара";
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
