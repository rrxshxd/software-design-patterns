package BehavioralPatterns.ChainOfResponsibility;

public class Request {
    private boolean carAvailable;
    private double clientBalance;
    private String location;

    public Request(boolean carAvailable, double clientBalance, String location) {
        this.carAvailable = carAvailable;
        this.clientBalance = clientBalance;
        this.location = location;
    }

    public boolean isCarAvailable() {
        return carAvailable;
    }

    public double getClientBalance() {
        return clientBalance;
    }

    public String getLocation() {
        return location;
    }
}
