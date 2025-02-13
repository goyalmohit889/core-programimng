// package Asmweek1;
import java.util.Scanner;

// 2. Perimeter of a Rectangle

public class prec {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input of length: ");
        int l=sc.nextInt();
        System.out.println("input of width");
        int w = sc.nextInt();
        sc.close();
        float p = 2*(w+l);
        System.out.println(p);
        
    }
}
