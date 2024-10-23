package BehavioralPatterns_2.State;

public class OnTheWayState implements OrderState{
    @Override
    public void handleOrder(Order order) {
        System.out.println("Taxi is on the way.");
        order.setState(new FinishedState());
    }
}
