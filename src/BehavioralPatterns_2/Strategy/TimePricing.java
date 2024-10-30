package BehavioralPatterns_2.Strategy;

public class TimePricing implements PricingStrategy {
    @Override
    public double calculatePrice(double distance, double time) {
        return time * 500.0;
    }
}
