package design.problems.vehiclerental.search;

import design.problems.vehiclerental.Location;
import design.problems.vehiclerental.vehicle.Vehicle;

import java.util.Date;
import java.util.List;

public interface ISearch {
    List<Vehicle> getVehicles(Date startDate, Date endDate, Location pickupLocation, Location DropoffLocation, int searchRadiusInMeter);
}
