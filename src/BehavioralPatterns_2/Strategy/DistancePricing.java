package BehavioralPatterns_2.Strategy;

public class DistancePricing implements PricingStrategy {
    @Override
    public double calculatePrice(double distance) {
        return distance * 500.0; // Example price per km
    }
}
