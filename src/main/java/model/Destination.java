package model;

import java.util.ArrayList;
import java.util.List;

public class Destination {

    private String name;
    private List<Activity> activityList;

    public Destination(String name) {
        this.name = name;
        this.activityList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }


}
