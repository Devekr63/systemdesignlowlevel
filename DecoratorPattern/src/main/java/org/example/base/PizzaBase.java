package org.example.base;

import org.example.cook.Cook;

public abstract class PizzaBase implements Cook {
    private double price;
    private String type;

    public PizzaBase() {
        price = 100;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void cook(){
        System.out.println("Cooking for 15 mins on 180 degree Celsius.");
    }
}
