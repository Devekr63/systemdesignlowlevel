package org.example.parking;

public class ParkingSpot {
    private Integer floor;
    private String row;
    private String column;
    private ParkingSpotStatus status;

    public ParkingSpot(Integer floor, String row, String column) {
        this.floor = floor;
        this.row = row;
        this.column = column;
        status = ParkingSpotStatus.FREE;
    }

    public Integer getFloor() {
        return floor;
    }

    public String getRow() {
        return row;
    }


    public String getColumn() {
        return column;
    }


    public ParkingSpotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }
}
