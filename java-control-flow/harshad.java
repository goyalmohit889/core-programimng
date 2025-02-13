// package Asgmday2;
import java.util.Scanner;

//  Create a program to check if a number taken from the user is a Harshad Number.

public class harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int sum=0;
        while(n!=0){
            int temp = n%10;
            sum = sum+temp;
            n=n/10;
        }
        if(a%sum==0){
            System.out.println("Harsad No.");
        }
        else System.out.println("Not a harsad no.");
    }
}
