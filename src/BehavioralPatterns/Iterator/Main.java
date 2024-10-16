package BehavioralPatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        DriverList driverList = new DriverList(5);

        driverList.addDriver(new Driver("Anton", 2.5));
        driverList.addDriver(new Driver("Mikhail", 6.1));
        driverList.addDriver(new Driver("Aleksey", 4.7));
        driverList.addDriver(new Driver("Egor", 1.4));
        driverList.addDriver(new Driver("Sergey", 3.8));

        Iterator<Driver> iterator = driverList.createIterator();

        Driver closestDriver = null;
        double closestDistance = Double.MAX_VALUE;

        while (iterator.hasNext()) {
            Driver currentDriver = iterator.next();
            if (currentDriver.getDistanceFromClient() < closestDistance) {
                closestDistance = currentDriver.getDistanceFromClient();
                closestDriver = currentDriver;
            }
        }

        if (closestDriver != null) {
            System.out.println("Closest driver: " + closestDriver.getName() + " with a distance of " + closestDriver.getDistanceFromClient() + " km.");
        } else {
            System.out.println("No driver found.");
        }
    }
}
