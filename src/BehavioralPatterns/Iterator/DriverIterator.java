package BehavioralPatterns.Iterator;

public class DriverIterator implements Iterator<Driver>{
    private Driver[] drivers;
    private int position = 0;

    public DriverIterator(Driver[] drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean hasNext() {
        return position < drivers.length && drivers[position] != null;
    }

    @Override
    public Driver next() {
        return drivers[position++];
    }
}
