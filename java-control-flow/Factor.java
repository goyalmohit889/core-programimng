// package Asgmday2;
import java.util.Scanner;

// Create a program to find the factors of a number taken as user input.

public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}