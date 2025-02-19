import java.util.Scanner;

//  Write a program to find the sum of n natural numbers 
//  using recursive method and compare the result with the 
//  formulae n*(n+1)/2 and show the result from both computations is correct. 

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural no.");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number. Number should be greater than 0.");
        } else {
            int recursiveSum = sum(n);
            int formulaSum = (n * (n + 1)) / 2;
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("There is an error in the computation.");
            }
        }
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}

