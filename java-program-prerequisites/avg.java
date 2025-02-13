// package Asmweek1;
import java.util.Scanner;

//  4. Calculate Average of Three Numbers

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd no.: ");
        int c=sc.nextInt();
        System.out.println("Enter 3rd no.: ");
        int b=sc.nextInt();
        double avg=(a+b+c)/3;
        System.out.println("Average: "+avg);
    }
}
