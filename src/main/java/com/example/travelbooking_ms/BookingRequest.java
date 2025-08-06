package com.example.travelbooking_ms;

public class BookingRequest {
    private String type;         // train, bus, hotel
    private String user;
    private String source;
    private String destination;
    private String date;
    private int passengers;

    // Getters
    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getPassengers() {
        return passengers;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
