package design.problems.vehiclerental;

import design.problems.vehiclerental.vehicle.*;

public class Main {
    public static void main(String[] args) {
        Location rentalLot1Location = new Location("lot1-location", "Gurugram", new Coordinate(28.4595, 77.0266));
        RentalLot rentalLot1 = new RentalLot(rentalLot1Location);
        rentalLot1.getInventory().addVehicle(getSampleCar());

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        vehicleRentalSystem.addRentalLot(rentalLot1);


    }

    private static Vehicle getSampleCar() {
        return new Car("123", Color.RED, 2021, 100, Manufacturer.MARUTI, "Swift", 100);
    }
}
