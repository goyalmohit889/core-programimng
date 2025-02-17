import java.util.Scanner;

//  An organization took up an exercise to find the Body Mass 
//  Index (BMI) of all the persons in the team. For this create 
//  a program to find the BMI and display the height, weight, BMI 
//  and status of each individual

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            weight[i] = scanner.nextDouble();

            System.out.print("Enter height (in meters): ");
            height[i] = scanner.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI and Weight Status of Each Person:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }
    }
}
