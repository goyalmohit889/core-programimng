// package Asgmday2;//

//  Write a program to check if the first, second, or third number is the largest of the three.

public class largecheck {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int c=4;
        if(a>b && a>c){
            System.out.println("first number is largest");
        }
        else if(b>a && b>c){
            System.out.println("second number is largest");
        }
        else{
            System.out.println("third number is largest");
        }
    }
}
