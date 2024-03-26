package design.problems.vehiclerental.reservation;

import design.problems.vehiclerental.Location;
import design.problems.vehiclerental.RentalLot;
import design.problems.vehiclerental.vehicle.Vehicle;

import java.util.Date;

public interface IReservation {
    boolean reserveVehicle(Vehicle vehicle, Date pickupDate, Date dropoffDate, RentalLot pickupRentalLot, RentalLot dropoffRentalLot);
}
