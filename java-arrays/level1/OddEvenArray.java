import java.util.Scanner;

//  Create a program to save odd and even numbers into odd and even arrays between 1 to the 
//  number entered by the user. Finally, print the odd and even numbers array

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        if(n<=0){
            System.out.println("ERROR!!!, pleade enter natural no.");
        }
        else{
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
            int oddArr[] = new int[oddCount];
            int evenArr[] = new int[evenCount];
            int a=0;
            int b=0;

            for(int i=1;i<=n;i++){
                if(i%2==0){
                    evenArr[a++]=i;
                }
                else{
                    oddArr[b++]=i;
                }
            }
            for(int i=0;i<evenCount;i++){
                System.out.println("Even no. is: "+evenArr[i]);
            }
            System.out.println();
            for(int i=0;i<oddCount;i++){
                System.out.println("Odd no. is: "+oddArr[i]);
            }


        }
    }
}
