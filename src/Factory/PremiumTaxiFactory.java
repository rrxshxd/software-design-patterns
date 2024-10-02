package Factory;

public class PremiumTaxiFactory extends TaxiFactory {
    @Override
    public Taxi createTaxi(String driverName, String license) {
        return new PremiumTaxi(driverName, license);
    }
}
