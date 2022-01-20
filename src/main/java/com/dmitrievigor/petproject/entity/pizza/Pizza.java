package com.dmitrievigor.petproject.entity.pizza;


public  class Pizza  {
    private String description;
    private double cost;
    private String size ;

    private boolean cheese;
    private boolean mashrooms;
    private boolean tomato;


    public Pizza() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isMashrooms() {
        return mashrooms;
    }

    public void setMashrooms(boolean mashrooms) {
        this.mashrooms = mashrooms;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }
}
