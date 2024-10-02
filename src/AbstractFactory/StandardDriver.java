package AbstractFactory;

public class StandardDriver extends Driver {
    public StandardDriver(String driverName) {
        super(driverName);
    }

    @Override
    public void drive() {
        System.out.println("Driving regularly.");
    }
}
