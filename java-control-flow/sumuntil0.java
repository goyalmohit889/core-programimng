// package Asgmday2;
import java.util.Scanner;

//  Write a program to find the sum of numbers until the user enters 0

public class sumuntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double score = sc.nextDouble();

        while(score!=0){
            total +=score;
            score=sc.nextDouble();
        }
        System.out.println(total);
    }
}
