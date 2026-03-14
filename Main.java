import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingLot parkingLot = new ParkingLot(5); // total slots

        while (true) {

            System.out.println("\n--- Parking System ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show Parking Status");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String number = sc.nextLine();

                    System.out.print("Enter Vehicle Type (Car/Bike): ");
                    String type = sc.nextLine();

                    Vehicle vehicle;

                    if (type.equalsIgnoreCase("Car")) {
                        vehicle = new Car(number);
                    } else {
                        vehicle = new Bike(number);
                    }

                    parkingLot.parkVehicle(vehicle);
                    break;

                case 2:
                    System.out.print("Enter Vehicle Number to remove: ");
                    String removeNumber = sc.nextLine();

                    parkingLot.removeVehicle(removeNumber);
                    break;

                case 3:
                    parkingLot.showParkingStatus();
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}