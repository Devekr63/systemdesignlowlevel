package org.example.ticket.controller;

import org.example.car.Car;
import org.example.parking.ParkingSpot;
import org.example.ticket.Ticket;
import org.example.ticket.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TicketController {
    public List<Ticket> createTickets(Map<Car, ParkingSpot> allotment){
        List<Ticket> newTickets = new ArrayList<>();
        allotment.forEach((car, spot) -> {
            Ticket ticket = new Ticket(car.getCarNo()+spot.getFloor()+spot.getRow()+spot.getColumn(),
                    car, spot, new Time("Monday", 1000));
            newTickets.add(ticket);
        });
        return newTickets;
    }

    public List<Ticket> billTickets(List<Ticket> tickets){
        List<Ticket> billedTickets = new ArrayList<>();
        for(Ticket t : tickets){
            t.setExitTime(new Time("Monday", 1100));
            t.calculateAmount();
            billedTickets.add(t);
        }
        return billedTickets;
    }
}
