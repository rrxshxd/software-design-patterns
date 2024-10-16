package BehavioralPatterns.Command;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        TaxiService taxiService = new TaxiService();

        Command createOrder = new CreateOrderCommand(order, "Center");
        Command cancelOrder = new CancelOrderCommand(order);
        Command changeDestination = new ChangeDestinationCommand(order, "Downtown");

        taxiService.setCommand(createOrder);
        taxiService.executeCommand();

        taxiService.setCommand(cancelOrder);
        taxiService.executeCommand();

        taxiService.setCommand(changeDestination);
        taxiService.executeCommand();
    }
}
