package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create passenger types
        PassengerType standard = new PassengerType("Standard", 0);
        PassengerType gold = new PassengerType("Gold", 0.10);
        PassengerType premium = new PassengerType("Premium", 1.0);

        // Create activities
        Activity activity1 = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, null);
        Activity activity2 = new Activity("Hiking", "Explore the trails", 30.0, 15, null);

        // Create destinations
        List<Activity> activities = new ArrayList<>();
        activities.add(activity1);
        activities.add(activity2);
        Destination destination = new Destination("Mountain Resort", activities);

        // Create passengers
        Passenger passenger1 = new Passenger("Alice", 1, 100.0, standard);
        Passenger passenger2 = new Passenger("Bob", 2, 200.0, gold);
        Passenger passenger3 = new Passenger("Charlie", 3, 0.0, premium);

        // Create itinerary
        List<Destination> itinerary = new ArrayList<>();
        itinerary.add(destination);
        TravelPackage travelPackage = new TravelPackage("Mountain Adventure", 50, itinerary);

        // Add passengers to travel package
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Print travel package details
        travelPackage.printItinerary();
        travelPackage.printPassengerList();
    }
}