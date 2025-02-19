import java.util.Scanner;

//  Write a program to input the Principal, Rate, and Time values 
//  and calculate Simple Interest.

public class Si {

    public static void si(int principal,float rate,int time) {
        double si = (principal*rate*time)/100;
        System.out.printf("The Simple Interest is %.2f for Principal %d, Rate of Interest %.2f and Time %d",si,principal,rate,time);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter Rate of intrest: ");
        int rate = sc.nextInt();
        System.out.print("Enter Time: ");
        int time = sc.nextInt();
        si(principal, rate, time);
    }
}
