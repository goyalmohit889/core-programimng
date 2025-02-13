// package Asgmday2;
import java.util.Scanner;

//  Rewrite the program 10 to find the sum until the user enters 0 
//  or a negative number using while loop and break statement

public class total {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double score = sc.nextDouble();

        while(true){
            total +=score;
            score=sc.nextDouble();
            if(score<=0){
                break;
            }
        }
        System.out.println(total);
    }
}
