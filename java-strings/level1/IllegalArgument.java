import java.util.Scanner;

//  Write a program to demonstrate IllegalArgumentException

public class IllegalArgument {
    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println("Attempting to create a substring with invalid indices...");
            System.out.println(text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: IllegalArgumentException");
            System.out.println("Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Exception caught: RuntimeException");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        System.out.println("Handling IllegalArgumentException:");
        handleIllegalArgumentException(userInput);
    }
}
