// package Asmweek1;

// 1. Calculate Simple Interest

import java.util.Scanner;


public class si {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input of principal amount");
        int p=sc.nextInt();
        int rate=sc.nextInt();
        System.out.println("input of time");
        int time = sc.nextInt();
        sc.close();
        int si=(p*rate*time)/100;
        System.out.println("Simple intrest is: "+si);
    }
}


