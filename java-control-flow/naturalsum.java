// package Asgmday2;

import java.util.Scanner;

//  Write a program to check for the natural number and write the sum of n natural numbers 

public class naturalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n+1) / 2 ;
        if(n>0) System.out.printf("The sum of %d natural numbers is %d",n,sum);
        else System.out.printf("The number %d is not a natural number",n);
    }

}
