// package Asgmday1;
import java.util.Scanner;

public class collfeedis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Collage Fee: ");
        int collageFee = sc.nextInt();
        System.out.println("Enter Collage Fee Discount: ");
        double discountPercent = sc.nextDouble();
        double discount = (collageFee/100)*discountPercent;
        double afterDiscount = collageFee-discount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f ",discount,afterDiscount);

    }
}
