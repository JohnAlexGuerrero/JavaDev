package org.example.Entities;

public class Slot {
    private String type;
    private Vehicle vehicle;
    private String ticketid;

    public Slot(String type) {
        this.type = type;
        this.vehicle = null;
        this.ticketid = null;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

    public String getType() {
        return type;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getTicketid() {
        return ticketid;
    }
}
