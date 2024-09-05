package org.example.strategy.design;

import org.example.strategy.design.strategy.FastAndFurious;

public class SportCar extends Vehicle{
    public SportCar(FastAndFurious driveStrategy) {
        super(driveStrategy);
    }
}
