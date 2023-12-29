package model;

import java.util.HashMap;
import java.util.Map;

public class Passenger {

    private String name;
    private Integer number;
    private PassengerType passengerType;
    private Double totalBudget;
    private Double remainingBudget;
    private Map<Activity, Double> activityList;

    public Double getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(Double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public Double getRemainingBudget() {
        return remainingBudget;
    }

    public void setRemainingBudget(Double remainingBudget) {
        this.remainingBudget = remainingBudget;
    }

    public Map<Activity, Double> getActivityList() {
        return activityList;
    }

    public void setActivityList(Map<Activity, Double> activityList) {
        this.activityList = activityList;
    }

    public Passenger(String name, Integer number, PassengerType passengerType, Double budget) {
        this.name = name;
        this.number = number;
        this.passengerType = passengerType;
        this.totalBudget = budget;
        this.remainingBudget = budget;
        this.activityList = new HashMap<>();
    }

    public Passenger(String name, Integer number, PassengerType passengerType) {
        this.name = name;
        this.number = number;
        this.passengerType = passengerType;
        this.totalBudget = 0.0;
        this.remainingBudget = 0.0;
        this.activityList = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }
}
