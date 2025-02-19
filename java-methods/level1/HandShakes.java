import java.util.Scanner;

//  Create a program to find the maximum number of handshakes 
//  among N number of students.

public class HandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Students");
        int n = sc.nextInt();
        handshakes(n);
    }
    public static void handshakes(int n) {
        int num = (n*(n-1))/2;
        System.out.println("No. of handshakes are: "+num);
    }
}
