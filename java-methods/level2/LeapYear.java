import java.util.Scanner;

//  Write a program that takes a year as input and outputs 
//  the Year is a Leap Year or not 

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        boolean b = leapYear(year);
        System.out.println(b);
    }
    public static boolean leapYear(int year) {
        if(year>=1582 && year%4==0 && (year%400==0 || year%100!=0)){
                return true;
        }
        return false;
    }
}
