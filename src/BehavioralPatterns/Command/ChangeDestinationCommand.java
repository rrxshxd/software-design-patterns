package BehavioralPatterns.Command;

public class ChangeDestinationCommand implements Command {
    private Order order;
    private String newDestination;

    public ChangeDestinationCommand(Order order, String newDestination) {
        this.order = order;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        order.changeDestination(newDestination);
    }
}
