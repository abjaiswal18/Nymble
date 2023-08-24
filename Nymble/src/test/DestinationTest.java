package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import activity.Activity;
import destination.Destination;

public class DestinationTest {

    @Test
    public void testGetName() {
        Destination destination = new Destination("Mountain Resort",  new ArrayList<>());

        assertEquals("Mountain Resort", destination.getName());
    }

    @Test
    public void testPrintActivities() {
        Destination destination = new Destination("Mountain Resort",  new ArrayList<>());
        Activity activity1 = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, destination);
        Activity activity2 = new Activity("Hiking", "Explore the trails", 30.0, 15, destination);
        destination.getActivities().add(activity1);
        destination.getActivities().add(activity2);

        // You can capture the printed output and assert it using specialized testing libraries
        // or by using System.out redirection for testing.
        destination.printActivities();
    }
}

