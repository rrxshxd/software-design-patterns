package AbstractFactory;

public class PremiumTaxi extends Taxi {
    public PremiumTaxi(Driver driver, String license) {
        super(driver, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Premium ride on RollsRoyce for passenger " + passenger);
    }
}
