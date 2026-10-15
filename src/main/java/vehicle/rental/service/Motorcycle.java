package vehicle.rental.service;

// TODO: Create a class extending Vehicle and implementing Rentable
// Add private field: engineCC (int)
// Constructor takes: licensePlate, brand, dailyRate, engineCC
// Implement getVehicleType() to return "Motorcycle"
// Implement rent() and returnVehicle() same as Car
// Implement calculateCost(int days): apply 10% discount (multiply by 0.9)

class Motorcycle extends Vehicle implements Rentable {
    // TODO: Add private field for engineCC
    private int engineCC;

    // TODO: Add constructor
    public Motorcycle(String licensePlate, String brand, double dailyRate, int engineCC) {
        super(licensePlate, brand, dailyRate);
        this.engineCC = engineCC;
    }

    // TODO: Implement rent()
    @Override
    public boolean rent() {
        if(getStatus() == RentalStatus.AVAILABLE) {
            setStatus(RentalStatus.RENTED);
            return true;
        }
        return false;
    }

    // TODO: Implement returnVehicle()
    @Override
    public boolean returnVehicle() {
        if(getStatus()== RentalStatus.RENTED) {
            setStatus(RentalStatus.AVAILABLE);
            return true;
        }
        return false;
    }

    // TODO: Implement calculateCost(int days) with 10% discount
    // Implement calculateCost(int days): apply 10% discount (multiply by 0.9)
    @Override
    public double calculateCost(int days) {
        return getDailyRate()*days*0.9;
    }

    // TODO: Implement getVehicleType()
    @Override
    public String getVehicleType() {
        return this.getClass().getSimpleName();
    }
}
