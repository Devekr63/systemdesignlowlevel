package org.example.cook;

public interface AppleWoodOven{
    int temp = 150;

    default void cookOnAppleWood() {
        System.out.println("Use apple wood oven to."+"temperature is : "+increaseTemp(30));

    }

    static int increaseTemp(int t){
        return temp+t;
    }
    static int checkTemp(){
        return temp;
    }
}
