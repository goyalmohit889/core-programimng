import java.util.Scanner;

//  An athlete runs in a triangular park with sides provided as 
//  input by the user in meters. If the athlete wants to complete 
//  a 5 km run, then how many rounds must the athlete complete

public class TringularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side1: " );
        int side1 = sc.nextInt();
        System.out.print("Enter Side2: " );
        int side2 = sc.nextInt();
        System.out.print("Enter Side3: " );
        int side3 = sc.nextInt();
        km(side1, side2, side3);
    }
    public static void km(int side1,int side2,int side3) {
        int distance = 5000;
        int perimeter = side1+side2+side3;
        int rounds = distance/perimeter;
        System.out.println("No. of rounds that Athelet done: "+rounds);
    }
}
