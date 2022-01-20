package com.dmitrievigor.petproject.entity.drink;


import java.math.BigDecimal;

public class Drink  {
    private String description;
    private double cost ;
    private String size ;



    private boolean lemon;
    private boolean cream;
    private boolean syrup;

    public Drink() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isLemon() {
        return lemon;
    }

    public void setLemon(boolean lemon) {
        this.lemon = lemon;
    }

    public boolean isCream() {
        return cream;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    public boolean isSyrup() {
        return syrup;
    }

    public void setSyrup(boolean syrup) {
        this.syrup = syrup;
    }

}
