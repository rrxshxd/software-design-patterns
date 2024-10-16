package BehavioralPatterns.Mediator;

public class Dispatcher {
    private Mediator mediator;

    public Dispatcher(Mediator mediator) {
        this.mediator = mediator;
    }

    public void processRequest() {
        System.out.println("Dispatcher: Processing request.");
        mediator.notify(this, "find driver");
    }
}
