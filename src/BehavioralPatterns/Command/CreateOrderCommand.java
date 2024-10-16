package BehavioralPatterns.Command;

public class CreateOrderCommand implements Command {
    private Order order;
    private String destination;

    public CreateOrderCommand(Order order, String destination) {
        this.order = order;
        this.destination = destination;
    }

    @Override
    public void execute() {
        order.create(destination);
    }
}
