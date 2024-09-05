package org.example.pizza_toppings;

import org.example.base.PizzaBase;

public class Jalepeno extends PizzaBase {
    private PizzaBase pizza;
    private double price;
    public Jalepeno(PizzaBase pizza) {
        this.pizza = pizza;
        price = 60.0;
    }

    @Override
    public double getPrice(){
        return pizza.getPrice() + price;
    }
}
