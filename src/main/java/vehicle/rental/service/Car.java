package vehicle.rental.service;

// TODO: Create a class extending Vehicle and implementing Rentable
// Add private field: seats (int)
// Constructor takes: licensePlate, brand, dailyRate, seats
// Implement getVehicleType() to return "Car"
// Implement rent(): if AVAILABLE, set to RENTED and return true; otherwise return false
// Implement returnVehicle(): if RENTED, set to AVAILABLE and return true; otherwise return false
// Implement calculateCost(int days): return dailyRate * days

class Car extends Vehicle implements Rentable {
    // TODO: Add private field for seats
    private int seats;

    // TODO: Add constructor
    public Car(String licensePlate, String brand, double dailyRate, int seats) {
        super(licensePlate, brand, dailyRate);
        this.seats = seats;
    }

    // TODO: Implement rent()
    // Implement rent(): if AVAILABLE, set to RENTED and return true; otherwise return false
    @Override
    public boolean rent() {
        if(getStatus() == RentalStatus.AVAILABLE) {
           setStatus(RentalStatus.RENTED);
            return true;
        }
        return false;
    }

    // TODO: Implement returnVehicle()
    // Implement returnVehicle(): if RENTED, set to AVAILABLE and return true; otherwise return false
    @Override
    public boolean returnVehicle() {
        if(getStatus()== RentalStatus.RENTED) {
            setStatus(RentalStatus.AVAILABLE);
            return true;
        }
        return false;
    }

    // TODO: Implement calculateCost(int days)
    // Implement calculateCost(int days): return dailyRate * days
    @Override
    public double calculateCost(int days) {
        return getDailyRate()*days;
    }

    // TODO: Implement getVehicleType()
    @Override
    public String getVehicleType() {
        return this.getClass().getSimpleName();
    }
}
