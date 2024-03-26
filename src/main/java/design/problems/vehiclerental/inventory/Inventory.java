package design.problems.vehiclerental.inventory;

import design.problems.vehiclerental.Location;
import design.problems.vehiclerental.vehicle.Vehicle;

import java.util.Date;
import java.util.List;

public interface Inventory {
    List<Vehicle> getVehicles(Date startDate, Date endDate, Location pickupLocation, Location DropoffLocation);
    void addVehicle(Vehicle vehicle);
    void removeVehicle(String registrationNumber);
}
