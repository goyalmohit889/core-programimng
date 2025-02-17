import java.util.Scanner;

//  Write a program to store multiple values in an array up to a maximum of 10 
//  or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 

public class sumofno {
        public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0; 
        int index = 0; 

        Scanner scanner = new Scanner(System.in);
        while (true) {
            double userInput = scanner.nextDouble();
            if (userInput <= 0 || index == 10) {
                break;
            }
            numbers[index] = userInput;
            index++; 
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("The total sum is: " + total);
    }
}