import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingSlot> slots;

    // Constructor
    public ParkingLot(int totalSlots) {
        slots = new ArrayList<>();

        for (int i = 1; i <= totalSlots; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    // Park Vehicle
    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied()) {
                slot.parkVehicle(vehicle);
                System.out.println("Vehicle parked at slot " + slot.getSlotNumber());
                return;
            }
        }

        System.out.println("Parking lot is full");
    }

    // Remove Vehicle
    public void removeVehicle(String vehicleNumber) {
        for (ParkingSlot slot : slots) {
            if (slot.isOccupied() &&
                slot.getParkedVehicle().getVehicleNumber().equals(vehicleNumber)) {

                slot.removeVehicle();
                System.out.println("Vehicle removed from slot " + slot.getSlotNumber());
                return;
            }
        }

        System.out.println("Vehicle not found");
    }

    // Show Parking Status
    public void showParkingStatus() {
        for (ParkingSlot slot : slots) {
            slot.displaySlotInfo();
        }
    }
}