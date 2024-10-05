package CreationalPatterns.AbstractFactory;

public class StandardTaxi extends Taxi {
    public StandardTaxi(Driver driver, String license) {
        super(driver, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Just a regular ride for passenger " + passenger);
    }
}
