package adapter.pattern;

// Adapter class that makes FahrenheitSensor compatible with TemperatureProvider
// TODO: Implement TemperatureProvider interface
// TODO: Wrap a FahrenheitSensor instance
// TODO: Convert Fahrenheit to Celsius using: (fahrenheit - 32) * 5 / 9

class SensorAdapter implements TemperatureProvider {
    // TODO: Declare private field for the FahrenheitSensor
    private FahrenheitSensor fahrenheitSensor;
    // TODO: Create constructor that accepts a FahrenheitSensor

    public SensorAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }
    // TODO: Implement getTemperatureCelsius() method
    // Remember to read from the sensor and convert to Celsius
    @Override
    public double getTemperatureCelsius() {
        return (fahrenheitSensor.readFahrenheit()-32)*5/9;
    }
}
