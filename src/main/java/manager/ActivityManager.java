package manager;

import model.Activity;
import model.Destination;

import java.util.List;

public class ActivityManager {

    private static volatile ActivityManager activityManager = null;

    private ActivityManager() {

    }
    public static ActivityManager getActivityManagerInstance() {
        if(activityManager == null) {
            synchronized (ActivityManager.class) {
                if (activityManager == null) {
                    activityManager = new ActivityManager();
                }
            }
        }
        return activityManager;
    }

    public void addActivityToDestination(Activity activity, Destination destination) {
        List<Activity> activityList1 = destination.getActivityList();
        activityList1.add(activity);
        activity.setDestinationName(destination.getName());
        destination.setActivityList(activityList1);
    }

    public void printActivityDetails(Activity activity) {
        System.out.println("ActivityName: " + activity.getName());
        System.out.println("ActivityDescription: " + activity.getDescription());
        System.out.println("ActivityCost: "+activity.getCost());

        System.out.println("SpacesAvailable: " +(activity.getTotalCapacity() - activity.getCurrentCapacity()));
    }
}
