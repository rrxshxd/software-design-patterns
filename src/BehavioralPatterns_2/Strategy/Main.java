package BehavioralPatterns_2.Strategy;

public class Main {
    public static void main(String[] args) {
        Order orderByDistance = new Order(new DistancePricing());
        double costDistance = orderByDistance.calculatePrice(10);
        System.out.println("Cost by distance "+ costDistance);

        Order orderByTime = new Order(new TimePricing());
        double costTime = orderByTime.calculatePrice(15);
        System.out.println("Cost by price " + costTime);

        Order orderByFixed  = new Order(new FixedPricing());
        double costFixed = orderByFixed.calculatePrice(0);
        System.out.println("Fixed price " + costFixed);
    }
}
