package org.example.machine;

public class Shelf {
    private int shelfId;
    private ItemType itemType;
    private int quantity;
    private double itemPrice;

    public Shelf(int shelfId, ItemType itemType, int quantity, double itemPrice) {
        this.shelfId = shelfId;
        this.itemType = itemType;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public int getShelfId() {
        return shelfId;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
