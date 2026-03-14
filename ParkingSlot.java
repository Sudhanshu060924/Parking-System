public class ParkingSlot {

    private int slotNumber;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    // Constructor
    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
        this.parkedVehicle = null;
    }

    // Getters
    public int getSlotNumber() {
        return slotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    // Park vehicle in slot
    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

    // Remove vehicle from slot
    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isOccupied = false;
    }

    // Display slot info
    public void displaySlotInfo() {
        if (isOccupied) {
            System.out.println("Slot " + slotNumber + " occupied by " +
                    parkedVehicle.getVehicleNumber());
        } else {
            System.out.println("Slot " + slotNumber + " is empty");
        }
    }
}