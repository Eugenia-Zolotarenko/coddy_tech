package adapter.pattern;

// Legacy sensor class that outputs temperature in Fahrenheit
// TODO: Create a class with:
// - A private double field for the Fahrenheit temperature
// - A constructor that sets the temperature
// - A method readFahrenheit() that returns the stored value

class FahrenheitSensor {
    // TODO: Declare private field for temperature
    private double tempFahrenheit;
    // TODO: Create constructor that accepts a double parameter
    public FahrenheitSensor(double tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
    }
    // TODO: Implement readFahrenheit() method
    public double readFahrenheit(){
        return this.tempFahrenheit;
    }
}

