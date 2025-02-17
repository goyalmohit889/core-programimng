import java.util.Scanner;

//  Create a program to find the bonus of 10 employees based on 
//  their years of service and the total bonus amount the company 
//  Zara has to pay, along with the old and new salary.

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                    continue;
                }
                break;
            }
            
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextInt();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                    continue;
                }
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println();
        for(int i=0;i<10;i++){   
            System.out.println("New Salary of Employ "+(i+1)+" is "+newSalary[i]);
        }
        System.out.printf("\nTotal bonus payout for all employees: %.2f\n", totalBonus);
        System.out.printf("Total old salary of all employees: %.2f\n" , totalOldSalary);
        System.out.printf("Total new salary of all employees: %.2f\n" , totalNewSalary);
    }
}
