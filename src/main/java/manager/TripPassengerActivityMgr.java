package manager;

import model.Activity;
import model.Passenger;
import strategy.PricingStrategy;

import java.util.Map;

public class TripPassengerActivityMgr {

    private static volatile TripPassengerActivityMgr tripPassengerActivityMgr = null;

    private TripPassengerActivityMgr() {

    }

    StrategyMgr strategyMgr;

    public static TripPassengerActivityMgr getTripPassengerActivityMgrInstance() {
        if(tripPassengerActivityMgr == null) {
            synchronized (TripPassengerActivityMgr.class) {
                if (tripPassengerActivityMgr == null) {
                    tripPassengerActivityMgr = new TripPassengerActivityMgr();
                }
            }
        }
        return tripPassengerActivityMgr;
    }

    public Boolean addActivityForTripPassenger(Passenger tripPassenger, Activity activity) {
        Map<Activity, Double> activityList = tripPassenger.getActivityList();

        if (activity.isFull()) {
            return false;
        }
        strategyMgr = StrategyMgr.getStrategyManagerInstance();

        PricingStrategy pricingStrategy = strategyMgr.determinePricingStrategy(tripPassenger);
        Double activityCost = pricingStrategy.getActivityPricing(tripPassenger, activity);

        if(Double.compare(activityCost, tripPassenger.getRemainingBudget()) < 0) {
            Double remainingBudget = tripPassenger.getRemainingBudget();
            remainingBudget = remainingBudget - activityCost;

            tripPassenger.setRemainingBudget(remainingBudget);
            activityList.put(activity,activityCost);
            tripPassenger.setActivityList(activityList);
        }
        else {
            return false;
        }

        return true;
    }
}
