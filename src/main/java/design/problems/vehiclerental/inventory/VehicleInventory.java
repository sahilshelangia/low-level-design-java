package design.problems.vehiclerental.inventory;

import design.problems.vehiclerental.Location;
import design.problems.vehiclerental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleInventory implements Inventory {
    private List<Vehicle> vehicles;
    // consider creating index here for low latency in the search query. eg- Map<VehicleType, Vehicle>


    public VehicleInventory() {
        this.vehicles = new ArrayList<>();
    }

    @Override
    public List<Vehicle> getVehicles(Date startDate, Date endDate, Location pickupLocation, Location DropoffLocation) {
        return null;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    @Override
    public void removeVehicle(String registrationNumber) {
        // todo: finds the vehicle and remove it.
    }

}
