package CreationalPatterns.AbstractFactory;

public class StandardFactory extends Factory {
    @Override
    public Taxi createTaxi(String driverName, String license) {
        Driver driver = new StandardDriver(driverName);
        return new StandardTaxi(driver, license);
    }

    @Override
    public Driver createDriver(String driverName) {
        return new StandardDriver(driverName);
    }
}
