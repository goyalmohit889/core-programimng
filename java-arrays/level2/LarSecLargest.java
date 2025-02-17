import java.util.Scanner;

//  Create a program to store the digits of the number in an array 
//  and find the largest and second largest element of the array.

public class LarSecLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. max of length '10'");
        int n=sc.nextInt();
        int max = 10;
        int arr[] = new int[max];
        int idx = 0;
        while(n!=0){
            arr[idx++]=n%10;
            n=n/10;
        }
        int largest = -1;
        int seclar = -1;
        for(int i=0;i<10;i++){
            if(arr[i]>largest){
                seclar = largest;
                largest=arr[i];
            }
            else if(arr[i]>seclar && seclar<largest){
                seclar = arr[i];
            }
        }
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + seclar);
    }
}
