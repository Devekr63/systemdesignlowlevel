package org.example.machine;

import java.util.List;

public class Inventory {
    List<Shelf> inventory;

    public Inventory(List<Shelf> inventory) {
        this.inventory = inventory;
    }

    public List<Shelf> getInventory() {
        return inventory;
    }
}
