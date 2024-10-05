package StructuralPatterns.Adapter;

public class Passenger {
    private String name;
    private String destination;
    public Passenger(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }
    public String getName() {
        return name;
    }
    public String getDestination() {
        return destination;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
