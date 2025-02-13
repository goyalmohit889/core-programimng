// package Asgmday1;

import java.util.Scanner;

//  Create a program to convert distance in kilometers to miles.

public class kmtomile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KM: ");
        double km = sc.nextInt();
        double mile = km*1.6;
        System.out.printf("The total miles is %.2f mile for the given %.2f km",mile,km);
    }
}
