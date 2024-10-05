package CreationalPatterns.Factory;

public abstract class TaxiFactory {
    public abstract Taxi createTaxi(String driverName, String license);
}
