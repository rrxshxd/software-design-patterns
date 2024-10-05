package StructuralPatterns.Adapter;

public class Car {
    private String carModel;
    private String carColor;
    private boolean isAvailable;
    public Car(String carModel, String carColor) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.isAvailable = true;
    }
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public String getCarColor() {
        return carColor;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
