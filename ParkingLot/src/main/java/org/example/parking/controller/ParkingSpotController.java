package org.example.parking.controller;

import org.example.parking.ParkingSpot;
import org.example.parking.ParkingSpotStatus;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotController {

    List<ParkingSpot> freeSpots = new ArrayList<>();

    public List<ParkingSpot> getFreeSpots(){
        return freeSpots;
    }
    public List<ParkingSpot> bookSpots(List<ParkingSpot> parkingSpots){
        List<ParkingSpot> bookedSpots = new ArrayList<>();
        for(ParkingSpot spot : parkingSpots){
            if(spot.getStatus() == ParkingSpotStatus.FREE){
                spot.setStatus(ParkingSpotStatus.OCCUPIED);
                bookedSpots.add(spot);
            }
        }
        return bookedSpots;
    }

    public void releaseSpots(List<ParkingSpot> parkingSpots){
        for(ParkingSpot spot : parkingSpots){
            spot.setStatus(ParkingSpotStatus.FREE);
        }
    }


    private void createParkingSpots(){
        freeSpots.add(new ParkingSpot(1, "A", "20"));
        freeSpots.add(new ParkingSpot(1, "A", "25"));
        freeSpots.add(new ParkingSpot(3, "A", "30"));
    }
}
