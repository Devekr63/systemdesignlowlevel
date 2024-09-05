package org.example.allotment;

import org.example.car.Car;
import org.example.parking.ParkingSpot;
import org.example.parking.controller.ParkingSpotController;
import org.example.ticket.Ticket;
import org.example.ticket.controller.TicketController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllotmentService {
    private ParkingSpotController parkingSpotController;
    private TicketController ticketController;
    Map<Car, ParkingSpot> allotment;
    List<ParkingSpot> freeSpots;

    public AllotmentService(){
        parkingSpotController = new ParkingSpotController();
        ticketController = new TicketController();
    }

    public List<Ticket> allotment(List<Car> cars){
        //allot spot
        //generate tickets
        List<Ticket> newTickets = new ArrayList<>();
        allotment = new HashMap<>();
        freeSpots = parkingSpotController.getFreeSpots();
        allot(cars);
        newTickets = generateTickets(allotment);
        return newTickets;
    }

    public List<Ticket> exitCars(List<Car> cars){

    }

    private List<Ticket> generateTickets(Map<Car, ParkingSpot> allotment){

    }

    private void allot(List<Car> cars){
        for(int i=0; i<cars.size(); i++){
            Car car = cars.get(i);
            ParkingSpot freeSpot = freeSpots.get(i);
            allotment.put(car, freeSpot);
        }
    }
}
