package org.example.normal_pizza;

import org.example.base.PizzaBase;

public class VegDelight extends PizzaBase {
    public VegDelight() {
        super();
    }

    public double getPrice(){
       return  super.getPrice() + 100;
    }
}
