package manager;

import model.Activity;
import model.Destination;
import model.Passenger;
import model.Trip;

import java.util.List;

public class TripManager {
    private static volatile TripManager tripManager = null;

    private TripManager() {

    }

    public static TripManager getTripManagerInstance() {
        if(tripManager == null) {
            synchronized (TripManager.class) {
                if (tripManager == null) {
                    tripManager = new TripManager();
                }
            }
        }
        return tripManager;
    }

    public Trip createTrip(String name, Integer capacity, List<Destination> destinationList) {
        Trip trip = new Trip(name, capacity, destinationList);
        return trip;
    }

    public void addDestinationToTrip(Destination destination, Trip trip) {
        List<Destination> destinations = trip.getDestinationList();
        destinations.add(destination);

        trip.setDestinationList(destinations);
    }

    public Boolean addPassengerToTrip(Passenger passenger, Trip trip) {
        List<Passenger> passengerList = trip.getPassengerList();
        passengerList.add(passenger);
        if (trip.isFull())
        {
            return Boolean.FALSE;
        }

        trip.setCurrentCapacity(trip.getCurrentCapacity()+1);
        trip.setPassengerList(passengerList);
        return Boolean.TRUE;
    }

    public void printPassengerList(Trip trip) {
        System.out.println("Package Name :" + trip.getName());
        System.out.println("Package Capacity :" + trip.getTotalCapacity());
        System.out.println("Passengers Enrolled:" + trip.getCurrentCapacity());

        for (Passenger passenger : trip.getPassengerList()) {
            System.out.println("Passenger Name :" + passenger.getName());
            System.out.println("Passenger Number :" + passenger.getNumber());
        }
    }

    public void printItinerary(Trip trip) {
        System.out.println("Package Name :" + trip.getName());

        for (Destination destination : trip.getDestinationList()) {
            System.out.println("Destination :" + destination.getName());

            for (Activity activity : destination.getActivityList()) {
                System.out.println("Activity :" + activity.getName());
                System.out.println("Activity cost:" + activity.getCost());
                System.out.println("Activity Capacity:" + activity.getTotalCapacity());
                System.out.println("Activity Description:" + activity.getDescription());
            }
        }
    }
}
