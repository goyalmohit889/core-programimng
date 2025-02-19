import java.util.Arrays;
import java.util.Scanner;

//  Create a program to find the factors of a number 
//  taken as user input, store the factors in an array, 
//  and display the factors. Also find the sum, sum of 
//  square of factors and product of the factors and display the results

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No." );
        int n=sc.nextInt();
        int arr1[] = factor(n);
        int add = sum(arr1);
        int square = square(arr1);
        int product=product(arr1);
        display(arr1,add,square,product);
    }

    public static int[] factor(int n) {
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                idx++;
            }
        }
        int arr[] = new int[idx];
        int idx1=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[idx1++]=i;
            }
        }
        return arr;
    }

    public static int sum(int arr1[]) {
        int add=0;
        for(int i=0;i<arr1.length;i++){
            add= add+arr1[i];
        }
        return add;
    }

    public static int square(int arr1[]) {
        int add=0;
        for(int i=0;i<arr1.length;i++){
            add= add+(arr1[i]*arr1[i]);
        }
        return add;
    }

    public static int product(int arr1[]) {
        int prod=1;
        for(int i=0;i<arr1.length;i++){
            prod=prod*arr1[i];
        }
        return prod;
    }
    public static void display(int arr[],int add,int square,int product) {
         System.out.println("Factors are: "+Arrays.toString(arr));
        System.out.println("sum is: "+add);
        System.out.println("Square sum is: "+square);
        System.out.println("Product is: "+product);
    }


}
