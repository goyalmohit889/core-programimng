import java.util.Scanner;

//  Working with Multi-Dimensional Arrays. Write a Java program to create a 
//  2D Array and Copy the 2D Array into a single dimension array

public class Copy2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n=sc.nextInt();
        System.out.print("Enter colume: ");
        int m=sc.nextInt();
        int arr[][] = new int[n][m];
        int arrr[] = new int[n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arrr[c++]=arr[i][j];
            }
        }
        for(int i=0;i<n*m;i++){
            System.out.print(arrr[i]+" ");
        }
    }
}
