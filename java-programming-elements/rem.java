// package Asgmday1;

//  Write a program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;


public class rem {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The Quotient is "+(num1/num2)+" and Reminder is "+(num1%num2));
    }
}
