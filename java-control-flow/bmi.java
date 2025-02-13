// package Asgmday2;

//  Create a program to find the BMI of a person

import java.util.Scanner;


public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg");
        int weight = sc.nextInt();
        System.out.println("Enter height in cm");
        int height = sc.nextInt();
        double meter = height*0.01;
        System.out.println(meter);
        double BMI = weight / (meter * meter);

        System.out.println(BMI);
        if(BMI>=40){ System.out.println("Obese");}
        else if(BMI>25) {System.out.println("Overweight");}
        else if(BMI>18.5) {System.out.println("Normal");}
        else {System.out.println("Underweight");}
    }
}
