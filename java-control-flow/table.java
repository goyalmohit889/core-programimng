// package Asgmday2;

//  Create a program to find the multiplication table of a number entered by the user from 6 to 9.

public class table {
    public static void main(String[] args) {
        for(int i=6;i<=9;i++){
            for(int j=1;j<11;j++){
                int mul=i*j;
                System.out.println(i+" * "+j+" = "+mul);
            }
            System.out.println("---------------------");
        }
    }
}
