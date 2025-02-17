import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] physicsMarks = new int[numberOfStudents]; 
        int[] chemistryMarks = new int[numberOfStudents]; 
        int[] mathsMarks = new int[numberOfStudents];   
        double[] percentages = new double[numberOfStudents]; 
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            while (true) {
                System.out.print("Enter marks for Physics: ");
                physicsMarks[i] = scanner.nextInt();
                if (physicsMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive marks for Physics.");
                }
            }
            while (true) {
                System.out.print("Enter marks for Chemistry: ");
                chemistryMarks[i] = scanner.nextInt();
                if (chemistryMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive marks for Chemistry.");
                }
            }
            while (true) {
                System.out.print("Enter marks for Maths: ");
                mathsMarks[i] = scanner.nextInt();
                if (mathsMarks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive marks for Maths.");
                }
            }
            
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            }else {
                grades[i] = "R";
            }
        }

        System.out.println("\nStudent Marks, Percentages, and Grades:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Marks in Physics: " + physicsMarks[i]);
            System.out.println("Marks in Chemistry: " + chemistryMarks[i]);
            System.out.println("Marks in Maths: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}
