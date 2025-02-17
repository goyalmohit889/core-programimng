import java.util.Scanner;

//  Write a program to take user input for the age of all 10 students in a class and check
//  whether the student can vote depending on his/her age is greater or equal to 18.

public class Voter {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        for(int a:arr){
            if(a>=18) System.out.println("the age "+a+" can vote");
            else if(a<=0) System.out.println("Invalid input");
            else System.out.println("the user can not vote");
        }
    }
}
