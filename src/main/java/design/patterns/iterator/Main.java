package design.patterns.iterator;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.addVehicle(new Vehicle("1"));
        parking.addVehicle(new Vehicle("2"));
        parking.addVehicle(new Vehicle("3"));


        VehicleIterator vit = parking.createIterator();
        if (vit.hasNext()) {
            Vehicle vehicle = (Vehicle) vit.next();
            System.out.println(vehicle.getNumber());
        }
    }
}
