package StructuralPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Hyundai Sonata","black");
        Passenger passenger = new Passenger("Mikhail","Airport");

        CarSharing carSharing = new CarSharing(car);
        TaxiService taxiService = new CarSharingAdapter(carSharing);

        taxiService.requestTaxi(passenger);
    }
}
