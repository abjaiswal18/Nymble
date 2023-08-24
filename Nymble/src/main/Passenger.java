package main;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private List<Activity> activities;
    private PassengerType passengerType;

    public Passenger(String name, int passengerNumber, double balance, PassengerType passengerType) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.passengerType = passengerType;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean addActivity(Activity activity, double price) {
        if (activities.contains(activity) || !hasSufficientBalance(price)) {
            return false;
        }
        
        double actualPrice = passengerType.applyDiscount(price);
        activities.add(activity);
        balance -= actualPrice;
        return true;
    }

    private boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    public boolean payForActivity(Activity activity) {
        double actualPrice = passengerType.applyDiscount(activity.getCost());
        if (hasSufficientBalance(actualPrice)) {
            activities.add(activity);
            balance -= actualPrice;
            return true;
        }
        return false;
    }
}