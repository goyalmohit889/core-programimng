import java.util.Scanner;

//  Write a program to take 2 numbers and print their quotient and reminder

public class QuotientAndRemainder {
    public static void findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        findRemainderAndQuotient(number, divisor);
    }
}
