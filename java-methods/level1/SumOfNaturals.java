import java.util.Scanner;

//  Write a program to find the sum of n natural numbers using loop

public class SumOfNaturals {
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();
        while(true){
            if (n < 1) {
                System.out.println("Please enter a positive integer.");
                 n = sc.nextInt();
                //  break;
            }
            else {
                int sum = sumOfNaturalNumbers(n);
                System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
                break;
            }
        }
    }
}
