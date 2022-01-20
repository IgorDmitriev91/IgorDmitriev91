package com.dmitrievigor.petproject.entity.pizza;

public class Pepperoni extends Pizza{
    private String size;
    private double cost = 2.2;



    public Pepperoni() {
    }

    public Pepperoni(String size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Пеперони";
    }

    @Override
    public double getCost() {
        if (size.equals("small")) {
            return cost-0.2;
        }
        else if(size.equals("medium")){
            return cost;
        }
        else return cost + 0.6;

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
