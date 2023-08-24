package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import activity.Activity;
import destination.Destination;
import passenger.Passenger;
import passenger.PassengerType;

public class PassengerTest {

    @Test
    public void testAddActivity() {
        PassengerType standard = new PassengerType("Standard", 0.0);
        Passenger passenger = new Passenger("Alice", 1, 100.0, standard);

        Activity activity = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, new Destination("Mountain Resort", new ArrayList<>()));
        
        assertTrue(passenger.addActivity(activity, 50.0));
    }

    @Test
    public void testPayForActivity() {
        PassengerType gold = new PassengerType("Gold", 0.10);
        Passenger passenger = new Passenger("Bob", 2, 200.0, gold);

        Activity activity = new Activity("Hiking", "Explore the trails", 30.0, 15, new Destination("Forest Trails", new ArrayList<>()));
        
        assertTrue(passenger.payForActivity(activity));
    }
}

