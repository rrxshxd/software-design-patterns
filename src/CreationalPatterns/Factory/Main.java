package CreationalPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        TaxiFactory factory = new StandardTaxiFactory();
        Taxi taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Austin");

        factory = new PremiumTaxiFactory();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Richard");
    }
}
