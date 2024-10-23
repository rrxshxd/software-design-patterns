package BehavioralPatterns_2.State;

public class Order {
    private OrderState state;
    public Order() {
        state = new CreatedState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handleOrder(this);
    }
}
