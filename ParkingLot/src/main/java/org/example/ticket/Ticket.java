package org.example.ticket;

import org.example.car.Car;
import org.example.parking.ParkingSpot;

import java.util.Formattable;
import java.util.Formatter;

public class Ticket {
    String ticketId;
    Car car;
    ParkingSpot parkingSpot;

    Time entryTime;
    Time exitTime;
    double amount;

    public Ticket(){}
    public Ticket(String ticketId, Car car, ParkingSpot parkingSpot, Time entryTime) {
        this.ticketId = ticketId;
        this.car = car;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.exitTime = null;
    }

    public void setExitTime(Time exitTime) {
        this.exitTime = exitTime;
    }

    public double calculateAmount(){
        int timeSpend = exitTime.time - entryTime.time;
        amount = timeSpend*100;
        return amount;
    }
}
