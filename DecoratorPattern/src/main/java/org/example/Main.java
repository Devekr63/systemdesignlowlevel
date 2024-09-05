package org.example;

import org.example.cook.AppleWoodOven;
import org.example.normal_pizza.Margherita;
import org.example.normal_pizza.VegDelight;
import org.example.pizza_toppings.ExtraCheese;
import org.example.pizza_toppings.Jalepeno;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        VegDelight vegdelight = new VegDelight();
        Margherita margherita = new Margherita();

        System.out.println("Price of veg delight pizza : "+vegdelight.getPrice());
        System.out.println("Price of margherita pizza : "+margherita.getPrice());

        ExtraCheese extraCheesePizza = new ExtraCheese(vegdelight);
        Jalepeno jalapenoPizza = new Jalepeno(margherita);

        System.out.println("Price of extra cheese veg delight pizza : "+extraCheesePizza.getPrice());
        System.out.println("Price of jalapeno margherita pizza : "+ jalapenoPizza.getPrice());

        Jalepeno specialPizza = new Jalepeno(extraCheesePizza);
        System.out.println("Price of special pizza : "+specialPizza.getPrice());

        specialPizza.cook();
        extraCheesePizza.cook();

        AppleWoodOven.increaseTemp(30);
        System.out.println("Temperature of the apple wood oven is: "+AppleWoodOven.checkTemp());


        System.out.println("\n");
        try{
            printName(" ");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bye.");
        }
    }

    public static void printName(String name) throws Exception {
        if (name.trim().isEmpty()) {
            throw new Exception("No name exists. Please enter the name.");
        } else {
            System.out.println("Name of the student is : " + name);
        }
    }
}