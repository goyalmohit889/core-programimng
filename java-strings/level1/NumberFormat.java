import java.util.Scanner;

//  Write a program to demonstrate NumberFormatException

public class NumberFormat {
    public static void handleNumberFormatException(String text) {
        try {
            System.out.println("Attempting to parse the text into an integer...");
            int number = Integer.parseInt(text); 
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: NumberFormatException");
            System.out.println("Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Exception caught: RuntimeException");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to number: ");
        String userInput = scanner.nextLine(); 
        System.out.println("\nHandling NumberFormatException:");
        handleNumberFormatException(userInput);
    }
}
