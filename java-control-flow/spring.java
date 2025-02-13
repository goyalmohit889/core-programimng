// package Asgmday2;
import java.util.Scanner;

//  Write a program SpringSeason that takes two int values month and day from 
//  the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”

public class spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date=sc.nextInt();
        int month = sc.nextInt();
        if(month>=3 && month<=6)System.out.println("Its a Spring Season");
        else if(month==3 || month==6 && date<=20) System.out.println("Its a Spring Season");
        else System.out.println("Its not a Spring Season");
    }
}
