package org.example;

import org.example.machine.*;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Making coins bank

        Map<Coins, Integer> coins = new HashMap<>();

        coins.put(Coins.ONE, 0);
        coins.put(Coins.TWO, 0);
        coins.put(Coins.FIVE, 0);
        coins.put(Coins.TEN, 0);

        //Creating inventory

        List<Shelf> shelves = Arrays.asList(
                new Shelf(100, ItemType.COKE, 20, ItemType.getPrice(ItemType.COKE)),
                new Shelf(101, ItemType.PEPSI, 20, ItemType.getPrice(ItemType.PEPSI)),
                new Shelf(100, ItemType.FANTA, 20, ItemType.getPrice(ItemType.FANTA)),
                new Shelf(100, ItemType.LIMCA, 20, ItemType.getPrice(ItemType.LIMCA))
        );


        VendingMachine vendingMachine = new VendingMachine(new Inventory(shelves),coins, new ArrayList<>());
    }
}