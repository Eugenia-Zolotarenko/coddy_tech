package adapter.pattern;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        double fahrenheit = 32.0;
        fahrenheit = 98.6;
        fahrenheit = 212.0;
        fahrenheit = 0.0;
        fahrenheit = 451.0;

        // TODO: Create a FahrenheitSensor with the input value
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor(fahrenheit);

        // TODO: Create a SensorAdapter that wraps the sensor
        SensorAdapter sensorAdapter = new SensorAdapter(fahrenheitSensor);

        // TODO: Store the adapter in a TemperatureProvider variable
        TemperatureProvider temperatureProvider = sensorAdapter;

        // TODO: Get the temperature in Celsius and print it
        // Format: "Temperature: [celsius] C" with one decimal place
        // Hint: Use String.format("%.1f", value) for formatting
        double tempCelsius = temperatureProvider.getTemperatureCelsius();
        System.out.printf("Temperature: %.1f C", tempCelsius);
    }
}
