// package Asgmday2;
import java.util.Scanner;

//  Create a program to print odd and even numbers between 1 to the number entered by the user.

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
