package manager;

import model.Activity;
import model.Passenger;

import java.util.Map;

public class TripPassengerMgr {

    private static volatile TripPassengerMgr tripPassengerMgr = null;

    private TripPassengerMgr() {

    }

    public static TripPassengerMgr getTripPassengerMgrInstance() {
        if(tripPassengerMgr == null) {
            synchronized (TripPassengerMgr.class) {
                if (tripPassengerMgr == null) {
                    tripPassengerMgr = new TripPassengerMgr();
                }
            }
        }
        return tripPassengerMgr;
    }

    public void printPassengerDetails(Passenger tripPassenger) {
        System.out.println("Passenger Name:" + tripPassenger.getName());
        System.out.println("Passenger Number:" + tripPassenger.getNumber());
        System.out.println("Passenger Balance:" + tripPassenger.getRemainingBudget());

        for (Map.Entry<Activity, Double> entry : tripPassenger.getActivityList().entrySet()) {
            System.out.println("Activity SignedUp :" + entry.getKey().getName());
            System.out.println("Price paid :" + entry.getValue());
            System.out.println("Destination :" + entry.getKey().getDestinationName());
        }
    }
}
