package BehavioralPatterns_2.Template;

public class StandardOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Checking taxi availability...");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost based on distance...");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Order confirmed.");
    }
}
