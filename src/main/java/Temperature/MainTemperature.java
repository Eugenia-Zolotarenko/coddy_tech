package Temperature;

public class MainTemperature {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        double celsiusInput = -100.5;

        // TODO: Use the setter to set the celsius value
        temp.setCelsius(celsiusInput);

        // TODO: Print whether the temperature is valid (format: "Valid: true" or "Valid: false")
        System.out.println("Valid: " + temp.isValid());

        // TODO: Print the Fahrenheit equivalent (format: "Fahrenheit: X.X")
        System.out.printf("Fahrenheit: %.1f", temp.getFahrenheit());
        // Hint: Use String.format("%.1f", value) for one decimal place
    }
}

