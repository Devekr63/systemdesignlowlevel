package org.example;

import org.example.strategy.design.OffRoadCar;
import org.example.strategy.design.PassengerCar;
import org.example.strategy.design.SportCar;
import org.example.strategy.design.strategy.DriveNormal;
import org.example.strategy.design.strategy.FastAndFurious;
import org.example.strategy.design.Vehicle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle fastCar = new SportCar(new FastAndFurious());
        fastCar.drive();

        Vehicle offroader = new OffRoadCar(new FastAndFurious());
        offroader.drive();

        Vehicle passengerCar = new PassengerCar(new DriveNormal());
        passengerCar.drive();
    }
}

