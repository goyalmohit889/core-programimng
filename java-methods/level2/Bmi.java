import java.util.Scanner;

//  An organization took up the exercise to find the Body Mass Index (BMI) 
//  of all the persons in the team of 10 members. For this create a program 
//  to find the BMI and display the height, weight, BMI and status of each individual

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            
            System.out.print("Enter the height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        String[] status = getBMIStatus(data);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + data[i][2]);
            System.out.println("BMI Status: " + status[i]);
            System.out.println("-----------------------------");
        }
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInM = heightInCm / 100;
            double bmi = weight / (heightInM * heightInM);
            data[i][2] = bmi;
        }
    }
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[10]; 
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 24.9) {
                status[i] = "Normal";
            } else if (bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        return status;
    }
}
