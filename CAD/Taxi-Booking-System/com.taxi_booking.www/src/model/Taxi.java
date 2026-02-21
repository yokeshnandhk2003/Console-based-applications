package model;

public class Taxi {
    private int id;
    private char location;
    private int freeTime;
    private int earnings;

    public Taxi(int id) {
        this.id = id;
        this.location = 'A';
        this.freeTime = 0;
        this.earnings = 0;
    }

    public int getId() {
        return id;
    }

    public char getLocation() {
        return location;
    }

    public void setLocation(char location) {
        this.location = location;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(int freeTime) {
        this.freeTime = freeTime;
    }

    public int getEarnings() {
        return earnings;
    }

    public void addEarnings(int amount) {
        this.earnings += amount;
    }
}