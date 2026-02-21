package controller;
import model.Transcation;
import service.ExpenseService;

import java.util.List;

public class ExpenseController {
    private  ExpenseService service = new ExpenseService();

    public void addTranscation(double amount, String category, String type) {
        service.addTranscation(amount, category, type);
    }

    public List<Transcation> viewTransactions() {
        return service.getAllTranscations();
    }

    public void updateTranscation(int id, double amount, String category, String type) {
        service.updateTranscation(id, amount, category, type);
    }

    public void deleteTranscation(int id) {
        service.deleteTranscation(id);
    }

    public double getBalance() {
        return service.calculateBalance();
    }

}
