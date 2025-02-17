import java.util.Scanner;

//  Create a program to find the factors of a number taken as user input, 
//  store the factors in an array, and display the factors

public class FactorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int idx=0;
        int maxSize = 10;
        int factors[]=new int[maxSize];
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[idx++]=i;
                if(idx==maxSize){
                    maxSize*=2;
                    int temp[] = new int[maxSize];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors=temp;
                }            
            }
        }
        for(int i=0;i<idx;i++){
            System.out.print(factors[i]+" ");
        }
    }
}
