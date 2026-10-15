package vehicle.rental.service;

// TODO: Create an enum representing the rental status of a vehicle
// Include values: AVAILABLE, RENTED, MAINTENANCE
// Add a private field 'description' (String)
// Add a constructor that takes the description
// Add a getter for description
// Descriptions: AVAILABLE="ready to rent", RENTED="currently in use", MAINTENANCE="under service"

enum RentalStatus {
    // TODO: Define enum values with descriptions
    AVAILABLE("ready to rent"),
    RENTED("currently in use"),
    MAINTENANCE("under service");
    // TODO: Add private field for description
    private String description;

    // TODO: Add constructor
    RentalStatus(String description) {
        this.description = description;
    }
    // TODO: Add getter for description
    public String getDescription() {
        return description;
    }
}
