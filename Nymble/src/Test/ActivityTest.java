package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import main.Activity;
import main.Destination;
import main.Passenger;
import main.PassengerType;

public class ActivityTest {

    @Test
    public void testGetAvailableSpaces() {
        Destination destination = new Destination("Mountain Resort", new ArrayList<>());
        Activity activity = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, destination);

        assertEquals(20, activity.getAvailableSpaces());
    }

    @Test
    public void testSignUpPassenger() {
        Destination destination = new Destination("Mountain Resort", new ArrayList<>());
        Activity activity = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, destination);

        Passenger passenger = new Passenger("Alice", 1, 100.0, new PassengerType("Standard", 0.0));

        assertTrue(activity.signUpPassenger(passenger));
    }
}
