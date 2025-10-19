package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius * 9.0 / 5.0 + 32.0;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f degrees C (%.1f degrees F) and %s", 
                           temperatureCelsius, temperatureFahrenheit(), conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tempCelsius = (tempFahrenheit - 32.0) * 5.0 / 9.0;
        return new WeatherData(tempCelsius, conditions);
    }

    public static void main(String[] args) {
        // Demonstrate instance methods
        WeatherData today = new WeatherData(25.0, "Sunny");
        System.out.println("Today's weather: " + today.getSummary());
        
        // Demonstrate static factory method
        WeatherData yesterday = WeatherData.fromFahrenheit(50.0, "Cloudy");
        System.out.println("Yesterday's weather: " + yesterday.getSummary());
    }
}
