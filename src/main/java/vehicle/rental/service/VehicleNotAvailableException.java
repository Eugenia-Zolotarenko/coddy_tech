package vehicle.rental.service;

// TODO: Create a custom exception that extends Exception
// The constructor should accept a license plate (String)
// Create a message in the format: "Vehicle not available: [licensePlate]"

class VehicleNotAvailableException extends Exception {
    // TODO: Implement constructor that takes licensePlate
    // and passes the formatted message to the parent constructor

    public VehicleNotAvailableException(String licensePlate) {
        super("Vehicle not available: "+ licensePlate);
    }
}
