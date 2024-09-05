package org.example.strategy.design.strategy;

public class FastAndFurious implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive fast and furious.");
    }
}
