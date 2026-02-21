package model;

public class Booking {

    private int customerId;
    private int taxiId;
    private char pickup;
    private char drop;
    private int pickupTime;
    private int dropTime;
    private int fare;

    public Booking(int customerId, int taxiId, char pickup, char drop,
                   int pickupTime, int dropTime, int fare) {
        this.customerId = customerId;
        this.taxiId = taxiId;
        this.pickup = pickup;
        this.drop = drop;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.fare = fare;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public char getPickup() {
        return pickup;
    }

    public char getDrop() {
        return drop;
    }

    public int getFare() {
        return fare;
    }
}
