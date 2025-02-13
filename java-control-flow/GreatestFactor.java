// package Asgmday2;
import java.util.Scanner;

//  Create a program to print the greatest factor of a number beside itself using a loop.

public class GreatestFactor {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int gf=1;
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                gf=i;
                break;
            }
        }
        System.out.println("Greatest Factor is "+gf);

    }
}
