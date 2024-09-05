package org.example.machine;

public enum ItemType {
    COKE,
    PEPSI,
    FANTA,
    LIMCA;

    public static double getPrice(ItemType itemType){
        return switch (itemType){
            case COKE -> 25.0;
            case PEPSI, FANTA -> 23.0;
            case LIMCA -> 22.0;
        };
    }
}
