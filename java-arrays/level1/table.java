import java.util.*;

//  Create a program to find the multiplication table of a number 
//  entered by the user from 6 to 9 and display the result

public class table {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[10];
        int a=1;
        int b=1;
        for(int i=0;i<10;i++){
            if(n>=6 && n<=9){
                arr[i]=a++*n;
            }
            else{
                System.out.println("No. should be in between 6 to 9");
                break;
            }
        }
        for(int i=0;i<10;i++){
            if(n>=6 && n<=9){
            System.out.println(n+"*"+(b++)+"="+arr[i]);
            }
        }
    }
}
