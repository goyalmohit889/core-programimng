// package Asmweek1;

// 3. Power Calculation

import java.util.Scanner;


public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input base No.: ");
        double n = sc.nextInt();
        System.out.println("Input exponent no.: ");
        double e=sc.nextInt();
        double pow = Math.pow(n, e);
        System.out.println(pow);
    }
    
}
