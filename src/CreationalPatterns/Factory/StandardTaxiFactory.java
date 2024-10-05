package CreationalPatterns.Factory;

public class StandardTaxiFactory extends TaxiFactory{
    @Override
    public Taxi createTaxi(String driverName, String license) {
        return new StandardTaxi(driverName, license);
    }
}
