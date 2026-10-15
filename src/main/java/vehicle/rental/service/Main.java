package vehicle.rental.service;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        String input = "ADD_CAR:ABC-123:Toyota:50.00:5";
        input = "ADD_MOTORCYCLE:XYZ-789:Honda:40.00:600";
        input = "ADD_CAR:ABC-123:Toyota:50.00:5,RENT:ABC-123:3";
        input = "ADD_CAR:ABC-123:Toyota:50.00:5,ADD_MOTORCYCLE:XYZ-789:Honda:40.00:600,RENT:ABC-123:3,RENT:ABC-123:2,AVAILABLE,RETURN:ABC-123";
        input = "ADD_MOTORCYCLE:MOTO-001:Yamaha:35.50:750,RENT:MOTO-001:5";
        input = "ADD_CAR:CAR-001:BMW:100.00:4,RENT:CAR-001:1,RETURN:CAR-001,RENT:CAR-001:2";
        input = "ADD_CAR:A1:Ford:45.00:5,ADD_CAR:A2:Chevy:55.00:4,ADD_MOTORCYCLE:M1:Suzuki:30.00:500,AVAILABLE";
        input = "RENT:UNKNOWN:3";
        input = "ADD_CAR:TEST-1:Audi:80.00:5,RETURN:TEST-1";
        input = "ADD_CAR:C1:Tesla:120.00:5,ADD_MOTORCYCLE:M1:Ducati:60.00:1200,ADD_CAR:C2:Honda:40.00:4,RENT:C1:7,RENT:M1:10,AVAILABLE,RETURN:C1,RETURN:M1,AVAILABLE";

        // TODO: Create a RentalAgency instance
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        RentalAgency agency = new RentalAgency(vehicles);

        // TODO: Split the input by comma to get individual commands
        String[] commands = input.split(",");

        // TODO: Process each command:
        // ADD_CAR:licensePlate:brand:dailyRate:seats -> print "Added: [brand] ([vehicleType])"
        // ADD_MOTORCYCLE:licensePlate:brand:dailyRate:engineCC -> print "Added: [brand] ([vehicleType])"
        // RENT:licensePlate:days -> print "Rented [licensePlate] for [days] days - Total: $[cost]" (2 decimals)
        //                           or "Error: [exception message]" if exception thrown
        // RETURN:licensePlate -> print "Returned: [licensePlate]" or "Return failed: [licensePlate]"
        // AVAILABLE -> print "Available vehicles:" followed by each available vehicle's details
        for(String command: commands){
            String license, brand;
            double dailyRate;
            int extraData ;
            String[] linesArray = command.split(":");
            ArrayList<String> lines = new ArrayList<>(List.of(linesArray)) ;
            switch (lines.get(0)){
                case "ADD_CAR" -> {
                    license = lines.get(1);
                    brand = lines.get(2);
                    dailyRate = Double.parseDouble(lines.get(3));
                    extraData = Integer.parseInt(lines.get(4));
                    Car car = new Car(license, brand, dailyRate, extraData );
                    agency.addVehicle(car);
                    System.out.printf("Added: %s (%s)\n", brand, car.getVehicleType());
                }
                case "ADD_MOTORCYCLE" ->{
                    license = lines.get(1);
                    brand = lines.get(2);
                    dailyRate = Double.parseDouble(lines.get(3));
                    extraData = Integer.parseInt(lines.get(4));
                   Motorcycle moto = new Motorcycle(license, brand, dailyRate, extraData);
                   agency.addVehicle(new Motorcycle(license, brand, dailyRate, extraData));
                    System.out.printf("Added: %s (%s)\n", brand, moto.getVehicleType());
                }
                // RENT:licensePlate:days -> print "Rented [licensePlate] for [days] days - Total: $[cost]" (2 decimals)
                //                           or "Error: [exception message]" if exception thrown
                case "RENT" ->{
                    int days = Integer.parseInt(lines.get(2));

                    try {
                        license = lines.get(1);
                        double cost = agency.rentVehicle(license, days);
                        System.out.printf("Rented %s for %d days - Total: $%.2f\n", license, days, cost);
                    } catch (VehicleNotAvailableException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                // RETURN:licensePlate -> print "Returned: [licensePlate]" or "Return failed: [licensePlate]"
                case "RETURN" ->{
                    license = lines.get(1);
                    System.out.println( agency.returnVehicle(license) ?
                                        String.format("Returned: %s", license) :
                                        String.format("Return failed: %s",  license));

                }
                // AVAILABLE -> print "Available vehicles:" followed by each available vehicle's details
                case "AVAILABLE" -> {
                    System.out.println("Available vehicles:");
                    for (Vehicle vehicle: vehicles){
                        if(vehicle.getStatus()==RentalStatus.AVAILABLE)
                            System.out.println(vehicle.getDetails());
                    }

                }
                default -> System.out.println("Invalid command");
            }
        }

        // TODO: After all commands, print "--- Fleet Summary ---"
        System.out.println("--- Fleet Summary ---");
        // followed by each vehicle's details
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle.getDetails());
        }
    }
}
