import manager.ActivityManager;
import manager.TripManager;
import manager.TripPassengerActivityMgr;
import manager.TripPassengerMgr;
import model.*;

import java.util.ArrayList;

public class Execution {

    public static void main(String []args) {
        Passenger passenger = new Passenger("Yaswanth", 1, PassengerType.STANDARD, 50.0);
        Activity activity = new Activity("Rafting", "Sky Rafting", 35.0, 10);
        Destination destination = new Destination("Pondicherry");

        ActivityManager activityManager = ActivityManager.getActivityManagerInstance();
        activityManager.addActivityToDestination(activity, destination);

        TripManager tripManager = TripManager.getTripManagerInstance();
        Trip trip = tripManager.createTrip("Trip1", 15, new ArrayList<>());
        tripManager.addDestinationToTrip(destination, trip);
        tripManager.addPassengerToTrip(passenger,trip);

        tripManager.printPassengerList(trip);

        System.out.println("--------------");

        tripManager.printItinerary(trip);

        TripPassengerActivityMgr tripPassengerActivityMgr =
                TripPassengerActivityMgr.getTripPassengerActivityMgrInstance();
        tripPassengerActivityMgr.addActivityForTripPassenger(passenger, activity);

        TripPassengerMgr tripPassengerMgr = TripPassengerMgr.getTripPassengerMgrInstance();

        System.out.println("--------------");
        tripPassengerMgr.printPassengerDetails(passenger);


        System.out.println("--------------");
        activityManager.printActivityDetails(activity);




    }
}
