// package Asgmday2;
import java.util.Scanner;

//  Write a program to check whether a person can vote, 
//  depending on whether his/her age is greater than or equal to 18.

public class validage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18) System.out.println("The person's age is "+age+" and can vote");
        else System.out.println("The person's age is "+age+" and cannot vote");
    }
}
