import java.util.Random;

public class EmployeeBonus {

    public static void main(String[] args) {
        int numberOfEmployees = 10;
        double[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] updatedData = calculateNewSalariesAndBonuses(employeeData);
        displayResults(employeeData, updatedData);
    }

    public static double[][] generateEmployeeData(int numberOfEmployees) {
        Random rand = new Random();
        double[][] data = new double[numberOfEmployees][2]; 

        for (int i = 0; i < numberOfEmployees; i++) {
            double salary = 10000 + (rand.nextDouble() * 90000);
            int yearsOfService = rand.nextInt(11); 
            data[i][0] = salary;
            data[i][1] = yearsOfService; 
        }
        return data;
    }

    public static double[][] calculateNewSalariesAndBonuses(double[][] employeeData) {
        double[][] newData = new double[employeeData.length][3];
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus;
            double newSalary;

            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; 
            } else {
                bonus = oldSalary * 0.02;
            }
            newSalary = oldSalary + bonus;

            newData[i][0] = newSalary; 
            newData[i][1] = bonus; 
            newData[i][2] = oldSalary; 
        }
        return newData;
    }

    public static void displayResults(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus");
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f%n", (i + 1), oldSalary, yearsOfService, newSalary, bonus);
        }

        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n", "Total", totalOldSalary, "", totalNewSalary, totalBonus);
    }
}
