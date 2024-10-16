package BehavioralPatterns.Iterator;

public class Driver {
    private String name;
    private double distanceFromClient;

    public Driver(String name, double distanceFromClient) {
        this.name = name;
        this.distanceFromClient = distanceFromClient;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromClient() {
        return distanceFromClient;
    }
}
