package design.problems.vehiclerental;

import design.problems.vehiclerental.reservation.IReservation;
import design.problems.vehiclerental.reservation.Reservation;
import design.problems.vehiclerental.search.ISearch;
import design.problems.vehiclerental.vehicle.Vehicle;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class VehicleRentalSystem implements ISearch, IReservation {
    private List<RentalLot> rentalLots;
    private List<Reservation> reservations;

    public VehicleRentalSystem() {
        this.rentalLots = new ArrayList<>();
    }

    public void addRentalLot(RentalLot rentalLot) {
        this.rentalLots.add(rentalLot);
    }

    @Override
    public List<Vehicle> getVehicles(Date startDate, Date endDate, Location pickupLocation, Location DropoffLocation, int searchRadiusInMeter) {
        // 1. Get list of all lots which are in searchRadius from pickupLocation.
        // 2. Get list of vehicles from each lot based on availability.
        // 3. Do some stuff, let's say sorting based on price, distance etc.
        return null;
    }

    @Override
    public boolean reserveVehicle(Vehicle vehicle, Date pickupDate, Date dropoffDate, RentalLot pickupRentalLot, RentalLot dropoffRentalLot) {
        // make a reservation out of it. and update reservations.
        // update availability of that vehicle.
        return false;
    }

    public boolean returnVehicle(Reservation reservation){
        // delete the date range from availability.
        // remove the vehicle from pickup lot.
        // add the vehicle in the dropoff lot.
        // etc.
        return true;
    }
}
