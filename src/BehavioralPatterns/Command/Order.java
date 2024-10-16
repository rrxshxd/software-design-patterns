package BehavioralPatterns.Command;

public class Order {
    private String destination;
    private boolean isActive;

    public void create(String destination) {
        this.destination = destination;
        isActive = true;
        System.out.println("The order is created. Destination: " + destination);
    }

    public void cancel() {
        if(isActive) {
            isActive = false;
            System.out.println("The order is cancelled.");
        } else {
            System.out.println("There are no active orders.");
        }
    }

    public void changeDestination(String newDestination) {
        if (isActive) {
            this.destination = newDestination;
            System.out.println("Destination changed to " + newDestination);
        } else {
            System.out.println("There are no active orders.");
        }
    }
}
