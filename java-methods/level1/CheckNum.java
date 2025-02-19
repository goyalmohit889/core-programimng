import java.util.Scanner;

//  Write a program to check whether a number is positive, negative, or zero.

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int n = sc.nextInt();
        check(n);
    }
    public static void check(int n) {
        int a=0;
        if(n>0){a=1;}
        else if (n<0){a=-1;}
        else{a=0;}
        System.out.println(a);
    }
}
