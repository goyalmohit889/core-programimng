import java.util.Scanner;

//  Create a program to take a number as input and reverse the number. 
//  To do this, store the digits of the number in an array and display
//  the array in reverse order

public class ReversDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int count = str.length();
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = n % 10;
            n /= 10;
        }
        System.out.print("Digits in reverse order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
    }
    
}
