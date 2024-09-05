package org.example.strategy.design.strategy;

public class DriveNormal implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive normal.");
    }
}
