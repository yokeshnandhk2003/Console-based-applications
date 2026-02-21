package view;

import controller.TaxiController;
import repository.*;
import model.*;
import exceptions.*;

import java.util.*;

public class TaxiView {

    private TaxiController controller = new TaxiController();
    private Scanner sc = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("\n1. Book Taxi");
            System.out.println("2. View Taxi Details");
            System.out.println("3. View Booking History");
            System.out.println("4. Exit");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> bookTaxi();
                    case 2 -> viewTaxis();
                    case 3 -> viewBookings();
                    case 4 -> { return; }
                    default -> System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                sc.nextLine();
            } catch (NoTaxiAvailableException | InvalidLocationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void bookTaxi() {
        System.out.print("Customer ID: ");
        int cid = sc.nextInt();

        System.out.print("Pickup (A-F): ");
        char pickup = sc.next().charAt(0);

        System.out.print("Drop (A-F): ");
        char drop = sc.next().charAt(0);

        System.out.print("Pickup Time: ");
        int time = sc.nextInt();

        System.out.println(controller.bookTaxi(cid, pickup, drop, time));
    }

    private void viewTaxis() {
        for (Taxi t : TaxiRepository.getAllTaxis()) {
            System.out.println(
                    "Taxi " + t.getId() +
                            " | Location: " + t.getLocation() +
                            " | Earnings: ₹" + t.getEarnings() +
                            " | Free at: " + t.getFreeTime()
            );
        }
    }

    private void viewBookings() {
        for (Booking b : BookingRepository.getAllBookings()) {
            System.out.println(
                    "Customer " + b.getCustomerId() +
                            " | Taxi " + b.getTaxiId() +
                            " | " + b.getPickup() + " → " + b.getDrop() +
                            " | Fare ₹" + b.getFare()
            );
        }
    }
}

