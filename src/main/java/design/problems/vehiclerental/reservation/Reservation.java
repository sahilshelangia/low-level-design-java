package design.problems.vehiclerental.reservation;

import design.problems.vehiclerental.Location;
import design.problems.vehiclerental.RentalLot;
import design.problems.vehiclerental.User;
import design.problems.vehiclerental.vehicle.Vehicle;

import java.util.Date;

public class Reservation {
    private String reservationNumber;
    private Date pickupDate;
    private Date dropoffDate;
    private RentalLot pickupRentalLot;
    private RentalLot dropoffRentalLot;
    private Vehicle vehicle;
    private User user;

    private double charges;
}
