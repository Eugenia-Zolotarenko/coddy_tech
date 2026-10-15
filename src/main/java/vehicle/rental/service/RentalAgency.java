package vehicle.rental.service;

import java.util.ArrayList;
import java.util.List;

// TODO: Create a class that manages the vehicle fleet using an ArrayList
// Implement the following methods:
// - addVehicle(Vehicle vehicle): adds a vehicle to the fleet
// - findVehicle(String licensePlate): returns the Vehicle or null
// - rentVehicle(String licensePlate, int days): finds vehicle, attempts rent (cast to Rentable),
//   returns rental cost. Throw VehicleNotAvailableException if not found or rent() returns false
// - returnVehicle(String licensePlate): finds and returns the vehicle, returning true on success
// - getAvailableVehicles(): returns ArrayList of vehicles with AVAILABLE status

class RentalAgency {

    // TODO: Add ArrayList to store vehicles
    private ArrayList<Vehicle> vehicles;

    // TODO: Add constructor
    public RentalAgency(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // TODO: Implement addVehicle(Vehicle vehicle)
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    // TODO: Implement findVehicle(String licensePlate)
    public Vehicle findVehicle(String licensePlate){
        for (Vehicle vehicle: vehicles){
            if(vehicle.getLicensePlate().equals(licensePlate))
                return vehicle;
        }
        return null;
    }

    // TODO: Implement rentVehicle(String licensePlate, int days) throws VehicleNotAvailableException
    public double rentVehicle(String licensePlate, int days) throws VehicleNotAvailableException{
        Vehicle vehicle = findVehicle(licensePlate);
        if( vehicle == null || vehicle.getStatus() == RentalStatus.RENTED){
            throw new VehicleNotAvailableException (licensePlate);
        } else {
            ((Rentable) vehicle).rent();
           return ((Rentable) vehicle).calculateCost(days);
        }
    }

    // TODO: Implement returnVehicle(String licensePlate)
    public boolean returnVehicle(String licensePlate){
        Vehicle vehicle = findVehicle(licensePlate);
        return  ((Rentable) vehicle).returnVehicle();
    }

    // TODO: Implement getAvailableVehicles()
    public List<Vehicle> getAvailableVehicles(){
        List<Vehicle> availabelVhicleList = new ArrayList<>();
        for(Vehicle vehicle: vehicles){
            if(vehicle.getStatus() == RentalStatus.AVAILABLE)
                availabelVhicleList.add(vehicle);
        }
        return availabelVhicleList;
    }
}
