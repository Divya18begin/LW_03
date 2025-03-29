package Q1;

public class Temperature {
    private double celsius; // Stores temperature in Celsius

    // No-Arg Constructor (default 0.0°C)
    public Temperature() {
        this.celsius = 0.0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter Method: Convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Getter Method: Return temperature in Celsius
    public double toCelsius() {
        return celsius;
    }

    // Setter Method: Set temperature in Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter Method: Set temperature using Fahrenheit (converts to Celsius)
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}
