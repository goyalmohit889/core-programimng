// package Asgmday1;

// Create a program to calculate the profit and loss in number and percentage 
//  based on the cost price of INR 129 and the selling price of INR 191. 

public class profit {
    public static void main(String[] args) {
        double profit = 191-129;
        double per = (profit/129)*100;
        System.err.printf("The Cost Price is INR 129 and Selling Price is INR 191 %n");
        System.out.printf("The Profit is INR %.2f and the Profit Percentage is %.2f ",profit,per);
    }
}
