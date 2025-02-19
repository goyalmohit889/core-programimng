import java.util.Scanner;

//  Create a program to divide N number of chocolates among M children. 
//  Print the number of chocolates each child will get and also the 
//  remaining chocolates

public class ChocolateDivision {
    public static void divideChocolates(int chocolates, int children) {
        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;
        System.out.println("Each child will get " + chocolatesPerChild + " chocolates.");
        System.out.println("The remaining chocolates are: " + remainingChocolates);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int children = sc.nextInt();
        if (children > 0) {
            divideChocolates(chocolates, children);
        } else {
            System.out.println("The number of children must be greater than zero.");
        }
    }
}
