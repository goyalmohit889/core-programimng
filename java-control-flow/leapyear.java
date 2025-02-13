// package Asgmday2;

import java.util.Scanner;

//  Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year>=1582 && year%4==0 && year%100!=0){
            System.out.println("It's a leap year");
        }
        else if(year%400==0){
            System.out.println("It's a leap year");
        }
        else System.out.println("It's not a leap year");
    }
}
