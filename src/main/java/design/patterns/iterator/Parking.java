package design.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Parking implements Aggregator {
    private List<Vehicle> vehicles;

    public Parking() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    @Override
    public VehicleIterator createIterator() {
        return new VehicleIterator(this.vehicles);
    }
}
