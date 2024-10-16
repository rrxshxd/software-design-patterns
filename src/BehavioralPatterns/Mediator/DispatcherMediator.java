package BehavioralPatterns.Mediator;

public class DispatcherMediator implements Mediator {
    private Client client;
    private Driver driver;
    private Dispatcher dispatcher;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }


    @Override
    public void notify(Object sender, String event) {
        if (sender instanceof Client && event.equals("request ride")) {
            System.out.println("DispatcherMediator: Client requested a ride.");
            dispatcher.processRequest();
        } else if (sender instanceof Driver && event.equals("ride complete")) {
            System.out.println("DispatcherMediator: Driver completed the ride.");
            driver.assignToRide();
        } else if (sender instanceof Dispatcher && event.equals("find driver")) {
            System.out.println("DispatcherMediator: Disepatcher is finding a driver.");
            client.notifyCompleted();
        }
    }
}
