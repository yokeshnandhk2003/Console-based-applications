package view;

import controller.AuthController;
import controller.ExpenseController;
import exception.AuthenticationException;
import exception.InvalidTranscationException;
import exception.TranscationNotFoundException;
import model.Transcation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpenseView {

    private ExpenseController expenseController = new ExpenseController();
    private AuthController authController = new AuthController();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("===Login=== ");
        login();

        while (true) {
            try {
                System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Balance 6.Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> add();
                    case 2 -> view();
                    case 3 -> update();
                    case 4 -> delete();
                    case 5 -> balance();
                    case 6 -> { return; }
                    default -> System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                sc.nextLine();
            } catch (InvalidTranscationException |
                     TranscationNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private void login() {

        int attemptsLeft = 3;

        while (attemptsLeft > 0) {
            try {
                System.out.print("Username: ");
                String user = sc.nextLine();

                System.out.print("Password: ");
                String pass = sc.nextLine();

                authController.login(user, pass);
                System.out.println("Login successful!\n");
                return;

            } catch (AuthenticationException e) {
                attemptsLeft--;
                System.out.println(e.getMessage());

                if (attemptsLeft > 0) {
                    System.out.println("Attempts left: " + attemptsLeft);
                } else {
                    System.out.println("All login attempts exhausted.");
                    System.out.println("Program terminated.");
                    System.exit(0);
                }
            }
        }
    }

    private void add() {
        System.out.print("Amount: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        System.out.print("Category: ");
        String cat = sc.nextLine();
        System.out.print("Type(income/expense): ");
        String type = sc.nextLine();
        expenseController.addTranscation(amt, cat, type);
    }

    private void view() {
        for (Transcation t : expenseController.viewTransactions()) {
            System.out.println(
                    t.getId()+" | "+t.getType()+" | ₹"+
                            t.getAmount()+" | "+t.getCategory()
            );
        }
    }

    private void update() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("New Amount: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        System.out.print("Category: ");
        String cat = sc.nextLine();
        System.out.print("Type: ");
        String type = sc.nextLine();
        expenseController.updateTranscation(id, amt, cat, type);
    }

    private void delete() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        expenseController.deleteTranscation(id);
    }

    private void balance() {
        System.out.println("Balance: ₹" + expenseController.getBalance());
    }
}
