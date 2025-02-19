import java.util.Random;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        double[][] scores = generateRandomScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
        
        sc.close();
    }

    public static double[][] generateRandomScores(int numberOfStudents) {
        Random rand = new Random();
        double[][] scores = new double[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + rand.nextInt(90); 
            scores[i][1] = 10 + rand.nextInt(90); 
            scores[i][2] = 10 + rand.nextInt(90); 
        }
        return scores;
    }

    public static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][4]; 
        
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2]; 
            double average = total / 3;
            double percentage = (total / 300) * 100; 
            
            results[i][0] = round(total);      
            results[i][1] = round(average);     
            results[i][2] = round(percentage);   
        }
        return results;
    }
    
    public static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void displayScorecard(double[][] scores, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f%n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }
}
