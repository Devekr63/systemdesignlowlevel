package org.example.strategy.design;

import org.example.strategy.design.strategy.DriveStrategy;

public class PassengerCar extends Vehicle{
    public PassengerCar(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
