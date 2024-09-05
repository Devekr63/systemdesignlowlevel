package org.example.normal_pizza;

import org.example.base.PizzaBase;

public class Margherita extends PizzaBase {
    public Margherita() {
        super();
    }


    public double getPrice(){
        super.setType("Whole Wheat.");
        System.out.println( "Base is made up of :  "+super.getType());
        return super.getPrice() + 150;
    }
}
