package service;
import model.*;
import repository.*;
import exceptions.*;

public class TaxiService {
    public String bookTaxi(int customerId, char pickup, char drop, int pickupTime) {

        if (pickup < 'A' || pickup > 'F' || drop < 'A' || drop > 'F') {
            throw new InvalidLocationException("Pickup and Drop must be between A and F");
        }

        Taxi selectedTaxi = null;
        int minDistance = Integer.MAX_VALUE;
        int minEarnings = Integer.MAX_VALUE;

        for (Taxi taxi : TaxiRepository.getAllTaxis()) {

            if (taxi.getFreeTime() <= pickupTime) {
                int distance = Math.abs(taxi.getLocation() - pickup) * 5;

                if (distance < minDistance ||
                        (distance == minDistance && taxi.getEarnings() < minEarnings)) {

                    minDistance = distance;
                    minEarnings = taxi.getEarnings();
                    selectedTaxi = taxi;
                }
            }
        }
        if (selectedTaxi == null) {
            throw new NoTaxiAvailableException("No taxi available at this time");
        }

        int travelDistance = Math.abs(pickup - drop) * 5;
        int fare = calculateFare(travelDistance);
        int dropTime = pickupTime + travelDistance / 5;

        selectedTaxi.setLocation(drop);
        selectedTaxi.setFreeTime(dropTime);
        selectedTaxi.addEarnings(fare);

        BookingRepository.addBooking(
                new Booking(customerId, selectedTaxi.getId(),
                        pickup, drop, pickupTime, dropTime, fare)
        );

        return "Taxi " + selectedTaxi.getId() + " booked successfully | Fare ₹" + fare;
    }

    private int calculateFare(int distance) {
        int fare = 100;
        if (distance > 5) {
            fare += (distance - 5) * 10;
        }
        return fare;
    }
}
