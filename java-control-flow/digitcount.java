// package Asgmday2;
import java.util.Scanner;

//  Create a program to count the number of digits in an integer.

public class digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        int a=n;
        while(n!=0){
            int temp=n%10;
            num++;
            n=n/10;
        }
        System.out.println(num);
    }
}
