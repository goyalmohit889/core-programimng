import java.util.Scanner;

//  Write a program FizzBuzz, take a number as user input and if it is a 
//  positive integer loop from 0 to the number and save the number, but for
//  multiples of 3 save "Fizz" instead of the number, for multiples of 5 save 
//  "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array 
//  results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...

public class FizzBizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a NO.: ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        if(n<=0){
            System.out.println("input is incorrect, it is greater than 0");
        }
        else{
            for(int i=1;i<=n;i++){
                if(i%3==0 && i%5==0){
                    arr[i-1]="Position "+Integer.toString(i)+" --> FizzBuzz";
                }
                else if(i%3==0){
                    arr[i-1]="Position "+Integer.toString(i)+" --> Fizz";
                }
                else if(i%5==0){
                    arr[i-1]="Position "+Integer.toString(i)+" --> Buzz";
                }
                else{
                    arr[i-1]="Position "+Integer.toString(i)+" --> "+Integer.toString(i);
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }


    }
}
