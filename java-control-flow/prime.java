// package Asgmday2;

import java.util.Scanner;

//  Write a Program to check if the given number is a prime number or not

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isPrime=false;
                // break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else System.out.println("Not Prime");
    }
}
