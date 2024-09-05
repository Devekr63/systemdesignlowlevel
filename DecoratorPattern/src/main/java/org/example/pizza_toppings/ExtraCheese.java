package org.example.pizza_toppings;

import org.example.base.PizzaBase;
import org.example.cook.AppleWoodOven;

public class ExtraCheese extends PizzaBase implements AppleWoodOven{
    private PizzaBase pizza;
    private double price;

    public ExtraCheese(PizzaBase pizza) {
        this.pizza = pizza;
        price = 50.0;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+price;
    }

    @Override
    public void cook(){
        super.cook();
        cookOnAppleWood();
    }
}
