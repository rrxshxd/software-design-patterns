package BehavioralPatterns.Mediator;

public class Driver {
    private Mediator mediator;

    public Driver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void assignToRide() {
        System.out.println("Driver: Assigned to a ride.");
        mediator.notify(this, "ride complete");
    }
}
