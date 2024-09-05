package org.example.strategy.design;

import org.example.strategy.design.strategy.FastAndFurious;

public class OffRoadCar extends Vehicle{
    public OffRoadCar(FastAndFurious driveStrategy) {
        super(driveStrategy);
    }
}
