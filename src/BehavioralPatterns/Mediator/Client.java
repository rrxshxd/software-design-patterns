package BehavioralPatterns.Mediator;

public class Client {
    private Mediator mediator;

    public Client(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestRide() {
        System.out.println("Client: Requesting a ride.");
        mediator.notify(this, "request ride");
    }

    public void notifyCompleted() {
        System.out.println("Client: Ride has been completed.");
    }
}
