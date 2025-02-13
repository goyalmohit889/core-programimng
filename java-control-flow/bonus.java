// package Asgmday2;
import java.util.Scanner;

//  Create a program to find the bonus of employees based on their years of service.

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary=sc.nextInt();
        int exp= sc.nextInt();
        if(exp>5){
            int a = (salary*5)/100;
            System.out.println(a);
        }
        else System.out.println("You are not eligible for the bonus!!!");

    }
}
