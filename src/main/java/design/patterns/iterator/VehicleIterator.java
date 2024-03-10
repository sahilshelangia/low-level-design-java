package design.patterns.iterator;

import java.util.List;
import java.util.Objects;

public class VehicleIterator implements Iterator {
    private List<Vehicle> vehicles;
    int index = 0;

    public VehicleIterator(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean hasNext() {
        if (vehicles.size() == index - 1) {
            return false;
        }
        return true;
    }

    @Override
    public Vehicle next() {
        return vehicles.get(index++);
    }
}
