// package Asgmday1;
import java.util.Scanner;

//  Write an IntOperation program by taking a, b, and c as input values 
//  and print the following integer operations a + b *c, a * b + c, c + a / b,
//  and a % b + c. Please also understand the precedence of the operators. 

public class intoperation {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter 1st no.: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no.: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no.: ");
        int c = sc.nextInt();
        System.out.println(a + b * c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
    }
}
