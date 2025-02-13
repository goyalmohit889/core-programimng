// package Asgmday2;

//  Write a Program to find the factorial of an integer entered by the user.

public class factorial {
    public static void main(String[] args) {
        int n=5;
        int mul=1;
        while(n!=0){
            mul*=n;
            n--;
        }
        System.out.println(mul);
    }
}
