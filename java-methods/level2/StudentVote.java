import java.util.Scanner;

//  Write a program to take user input for the age of all 10 students 
//  in a class and check whether the student can vote depending on 
//  his/her age is greater or equal to 18.

public class StudentVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(arr[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
    private static boolean canStudentVote(int age) {
        return age >= 18;
    }
}

