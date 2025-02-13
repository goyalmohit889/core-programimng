// package Asgmday1;
import java.util.Scanner;

//  Write a program to create a basic calculator that can perform addition, 
//  subtraction, multiplication, and division. The program should ask for two 
//  numbers (floating point) and perform all the operations

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int nums1=sc.nextInt();
        System.out.println("Enter first no.");
        int nums2=sc.nextInt();
        int sum=nums1+nums2;
        int sub=nums1-nums2;
        int mul=nums1*nums2;
        int div=nums1/nums2;
        System.out.printf(" The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d and %d: ",nums1,nums2,sum,sub,mul,div);
    }
}
