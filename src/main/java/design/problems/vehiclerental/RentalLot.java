package design.problems.vehiclerental;

import design.problems.vehiclerental.inventory.VehicleInventory;
import lombok.Data;

@Data
public class RentalLot {
    private Location location;
    private VehicleInventory inventory;

    public RentalLot(Location location) {
        this.location = location;
        this.inventory = new VehicleInventory();
    }
}
