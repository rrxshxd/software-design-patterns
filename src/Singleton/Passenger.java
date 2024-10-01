package Singleton;

public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void assignTaxi(String driver) {
        System.out.println(name + " ordered taxi with the driver " + driver);
    }
}