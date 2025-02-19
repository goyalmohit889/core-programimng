import java.util.Scanner;

//  Write a program to find the smallest and the largest of the 3 numbers.

public class SmallestAndLargest {
    public static void findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        findSmallestAndLargest(number1, number2, number3);
    }
}
