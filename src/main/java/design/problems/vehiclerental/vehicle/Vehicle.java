package design.problems.vehiclerental.vehicle;

public abstract class Vehicle {
    private String registrationNumber;
    private Color color;
    private int yearOfManufacturing;
    private int kilometerDriven;
    private Manufacturer manufacturer;
    private String modelName;
    private UnavailabilityDates unavailabilityDates;
    private int perDayRentalCharge;

    public Vehicle(String registrationNumber, Color color, int yearOfManufacturing, int kilometerDriven, Manufacturer manufacturer, String modelName, int perDayRentalCharge) {
        this.unavailabilityDates = new UnavailabilityDates();
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.yearOfManufacturing = yearOfManufacturing;
        this.kilometerDriven = kilometerDriven;
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.perDayRentalCharge = perDayRentalCharge;
    }
}
