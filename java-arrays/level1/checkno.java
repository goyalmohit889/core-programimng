import java.util.Scanner;

//  Write a program to take user input for 5 numbers and check whether a number is positive,  
//  negative, or zero. Further for positive numbers check if the number is even or odd. 
//  Finally compare the first and last elements of the array and display if they equal, greater or less

public class checkno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:arr){
            if(a>0) {
                System.out.println("Positive");
                if(a%2==0){
                    System.out.println("even");
                }
                else{
                    System.out.println("odd");
                }
            }
            else if(a<0) System.out.println("Negative");
            else System.out.println("zero");
        }
        if(arr[0]==arr[4]) System.out.println("equal");
        else if(arr[0]>arr[4]) System.out.println("first element is greater");
        else System.out.println("last element is greater");
    }
}
