package BehavioralPatterns_2.Strategy;

public class FixedPricing implements PricingStrategy {
    @Override
    public double calculatePrice(double value) {
        return 800.0;
    }
}
