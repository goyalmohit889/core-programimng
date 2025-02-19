//  Extend or Create a UnitConvertor utility class similar to the 
//  one shown in the notes to do the following.  
//  Please define static methods for all the UnitConvertor class methods

public class UnitConvertor3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = 37.78;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 5;
        double liters = 18.9;

        System.out.println(fahrenheit + " Fahrenheit is equal to " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is equal to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
    }
}
