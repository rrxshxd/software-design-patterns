package BehavioralPatterns.Mediator;

public class Main {
    public static void main(String[] args) {
        DispatcherMediator dispatcherMediator = new DispatcherMediator();

        Client client = new Client(dispatcherMediator);
        Driver driver = new Driver(dispatcherMediator);
        Dispatcher dispatcher = new Dispatcher(dispatcherMediator);

        dispatcherMediator.setClient(client);
        dispatcherMediator.setDriver(driver);
        dispatcherMediator.setDispatcher(dispatcher);

        client.requestRide();
    }
}
