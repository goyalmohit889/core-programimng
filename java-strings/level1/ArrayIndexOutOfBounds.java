import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            System.out.println("Attempting to access index 10 of the array...");
            System.out.println(names[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
            System.out.println("Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Exception caught: RuntimeException");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names you want to input: ");
        int n = scanner.nextInt(); 
        scanner.nextLine();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        System.out.println("Handling ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);
    }
}
