// package Asgmday2;
import java.util.Scanner;

//  Write a program to input marks and 3 subjects physics, chemistry and maths.
//  Compute the percentage and then calculate the grade as per the following guidelines 

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter markes of physics");
        int phy= sc.nextInt();
        System.out.println("Enter markes of chemistry");
        int chemistry = sc.nextInt();
        System.out.println("Enter markes of maths");
        int maths = sc.nextInt();

        int avg  = (phy+chemistry+maths)/3;

        if(avg>=80){
            System.out.println("Grade: A");
        }
        else if(avg>=70){
            System.out.println("Grade: B");
        }
        else if(avg>=60){
            System.out.println("Grade: C");
        }
        else if(avg>=50){
            System.out.println("Grade: D");
        }
        else if(avg>=40){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Grade: R");
        }
    }
}
