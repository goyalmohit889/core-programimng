import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            while (true) {
                System.out.print("Enter marks for Physics: ");
                marks[i][0] = scanner.nextInt();
                if (marks[i][0] >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive marks for Physics.");
                }
            }
            while (true) {
                System.out.print("Enter marks for Chemistry: ");
                marks[i][1] = scanner.nextInt();
                if (marks[i][1] >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive marks for Chemistry.");
                }
            }
            while (true) {
                System.out.print("Enter marks for Maths: ");
                marks[i][2] = scanner.nextInt();
                if (marks[i][2] >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive marks for Maths.");
                }
            }
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println("Marks in Physics: " + marks[i][0]);
            System.out.println("Marks in Chemistry: " + marks[i][1]);
            System.out.println("Marks in Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }
    }
}
