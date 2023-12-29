package model;

public class Activity {
    private String name;
    private String description;
    private Double cost;
    private Integer totalCapacity;
    private Integer currentCapacity;
    private String destinationName;

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Activity(String name, String description, Double cost, Integer totalCapacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.totalCapacity = totalCapacity;
        this.currentCapacity=0;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean isFull() {
        return this.totalCapacity == this.currentCapacity;
    }

}
