// package Asgmday2;
import java.util.Scanner;

//  Create a program to check if a number is armstrong or not. 
//  Use the hints to show the steps clearly in the code

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        int a=n;
        while(n!=0){
            int temp=n%10;
            num = num+(temp*temp*temp);
            n=n/10;
        }
        if(a==num) System.out.println("Amstrong");
        else System.out.println("Not Amstrong");
    }
}
