package model;

import java.util.ArrayList;
import java.util.List;

public class Trip {
    private String name;
    private Integer totalCapacity;
    private Integer currentCapacity;
    private List<Passenger> passengerList;
    private List<Destination> destinationList;
    public Trip(String name, Integer totalCapacity, List<Destination> destinationList) {
        this.name = name;
        this.totalCapacity = totalCapacity;
        this.destinationList = destinationList;
        this.currentCapacity = 0;
        this.passengerList = new ArrayList<>();
        this.destinationList = new ArrayList<>();
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }

    public void setDestinationList(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public Integer getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public Boolean isFull() {
        return currentCapacity == totalCapacity;
    }



}
