import java.util.Scanner;

//  Write a program calculate the wind chill temperature given the 
//  temperature and wind speed

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is: " + windChill);
    }
}
