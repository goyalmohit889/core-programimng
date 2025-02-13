// package Asgmday2;
import java.util.Scanner;

//  Write a program to check whether a number is positive, negative, or zero.

public class notype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0) System.out.println("positive");
        else if(n<0) System.out.println("negative");
        else System.out.println("zero");
    }
}
