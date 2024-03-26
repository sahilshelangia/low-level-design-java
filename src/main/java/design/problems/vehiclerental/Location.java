package design.problems.vehiclerental;

import design.problems.vehiclerental.vehicle.Coordinate;

public class Location {
    private String id;
    private String city;
    private Coordinate coordinate;

    public Location(String id, String city, Coordinate coordinate) {
        this.id = id;
        this.city = city;
        this.coordinate = coordinate;
    }
}
