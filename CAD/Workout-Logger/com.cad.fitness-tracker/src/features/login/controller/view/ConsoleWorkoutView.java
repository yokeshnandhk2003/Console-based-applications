package features.login.controller.view;
import service.WorkoutService;

import java.util.Scanner;
public class ConsoleWorkoutView implements WorkoutView {
    private Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Welcome to Workout Tracker");
        System.out.println("\n1.Add 2.View By Date 3.Update 4.Delete 5.Exit");
    }

    public int getChoice() {
        return sc.nextInt();
    }

    public void handle(int choice, WorkoutService service) {
        sc.nextLine();
        switch (choice) {
            case 1 -> System.out.println("Add Workout (logic here)");
            case 2 -> System.out.println("View Workout (logic here)");
            case 3 -> System.out.println("Update Workout (logic here)");
            case 4 -> System.out.println("Delete Workout (logic here)");
            case 5 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice");
        }
    }
}