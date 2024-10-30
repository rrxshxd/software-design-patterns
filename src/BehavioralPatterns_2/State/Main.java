package BehavioralPatterns_2.State;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.process();
        order.process();
        order.process();
        order.process();
    }
}
