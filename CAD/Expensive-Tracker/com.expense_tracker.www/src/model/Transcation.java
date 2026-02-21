package model;

import java.time.LocalDate;

public class Transcation {
    private int id;
    private double amount;
    private String category;
    private String type;
    private LocalDate date;

    public Transcation(int id, double amount, String category, String type) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
