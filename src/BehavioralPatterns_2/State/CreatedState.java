package BehavioralPatterns_2.State;

public class CreatedState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Order is ctreated.");
        order.setState(new ConfirmedState());
    }
}
