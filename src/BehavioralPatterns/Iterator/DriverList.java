package BehavioralPatterns.Iterator;

public class DriverList implements DriverCollection{
    private Driver[] drivers;
    private int index = 0;

    public DriverList(int size){
        drivers = new Driver[size];
    }

    public void addDriver(Driver driver){
        if (index < drivers.length){
            drivers[index++] = driver;
        }
    }
    @Override
    public Iterator<Driver> createIterator() {
        return new DriverIterator(drivers);
    }
}
