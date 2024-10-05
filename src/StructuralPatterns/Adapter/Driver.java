package StructuralPatterns.Adapter;

public class Driver {
    private Car car;

    public void addCar(Car car) {
        this.car = car;
        System.out.println("Driver has assigned the car " + car.getCarColor() + " " + car.getCarModel());
    }

    public void pickUpPassenger(Passenger passenger) {
        System.out.println("Driver is picking up " + passenger.getName() + " to " + passenger.getDestination());
    }
}
