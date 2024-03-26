package design.problems.vehiclerental.vehicle;


public class Car extends Vehicle {
    private int seats;
    private int engineCapacity;
    private FuelType fuelType;
    private int mileage;

    public Car(String registrationNumber, Color color, int yearOfManufacturing, int kilometerDriven, Manufacturer manufacturer, String modelName, int perDayRentalCharge) {
        super(registrationNumber, color, yearOfManufacturing, kilometerDriven, manufacturer, modelName, perDayRentalCharge);
    }

}
