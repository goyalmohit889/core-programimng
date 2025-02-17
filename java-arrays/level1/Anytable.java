import java.util.Scanner;

//  Create a program to print a multiplication table of a number.

public class Anytable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[10];
        int a=1;
        int b=1;
        for(int i=0;i<10;i++){
                arr[i]=a++*n;
        }
        for(int i=0;i<10;i++){
            System.out.println(n+"*"+(b++)+"="+arr[i]); 

        }
    }
}
