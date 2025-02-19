import java.util.Scanner;

//  Write a program to take user input for 5 numbers and check 
//  whether a number is positive or negative. Further for positive
//  numbers check if the number is even or odd. Finally compare the 
//  first and last elements of the array and display if they are 
//  equal, greater, or less

public class NumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.println(num + " is positive.");
                if (isEven(num)) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}
