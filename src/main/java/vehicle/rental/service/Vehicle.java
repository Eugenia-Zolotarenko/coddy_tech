package vehicle.rental.service;

// TODO: Create an abstract base class for all vehicles
// Private fields: licensePlate (String), brand (String), dailyRate (double), status (RentalStatus)
// Status should be initialized to AVAILABLE
// Constructor takes: licensePlate, brand, dailyRate
// Include getters for all fields and a setter for status
// Declare abstract method: getVehicleType() returning String
// Implement getDetails() returning: "[licensePlate] [brand] ([vehicleType]) - $[dailyRate]/day - [status description]"
// Format dailyRate to 2 decimal places

abstract class Vehicle {
    // TODO: Add private fields
    private String licensePlate, brand;
    private double dailyRate;
    private RentalStatus status = RentalStatus.AVAILABLE;

    // TODO: Add constructor
    public Vehicle(String licensePlate, String brand, double dailyRate) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.dailyRate = dailyRate;
    }

    // TODO: Add getters and setter for status
    public void setStatus(RentalStatus status) {
        this.status = status;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    // TODO: Declare abstract method getVehicleType()
    public abstract String getVehicleType();

    // TODO: Implement getDetails() method
    // Implement getDetails() returning: "[licensePlate] [brand] ([vehicleType]) - $[dailyRate]/day - [status description]"
// Format dailyRate to 2 decimal places
    public String getDetails(){
        return String.format("%s %s (%s) - $%.2f/day - %s",
                licensePlate , brand, getVehicleType(), dailyRate, status.getDescription());
    }
}
