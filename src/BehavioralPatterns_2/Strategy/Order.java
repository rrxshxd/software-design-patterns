package BehavioralPatterns_2.Strategy;

public class Order {
    private PricingStrategy strategy;

    public Order(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double value) {
        return strategy.calculatePrice(value);
    }
}
