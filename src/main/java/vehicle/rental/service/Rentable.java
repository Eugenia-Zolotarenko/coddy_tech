package vehicle.rental.service;

// TODO: Create an interface defining rental operations
// Declare the following methods:
// - rent() returning a boolean
// - returnVehicle() returning a boolean
// - calculateCost(int days) returning a double

interface Rentable {
    // TODO: Declare the three methods
    boolean rent();
    boolean returnVehicle();
    double calculateCost(int days);
}


