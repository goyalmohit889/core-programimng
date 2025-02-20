import java.util.Scanner;

//  Write a program to convert the complete text to lowercase and compare the results

public class ToLowerCase {
    public static String convertToLowercaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
            } else {
                result.append(ch); 
            }
        }
        return result.toString();
    }
    public static boolean compareStringsUsingCharAt(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false; 
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the complete text: ");
        String userInput = scanner.nextLine(); 

        String lowerCaseUsingBuiltIn = userInput.toLowerCase();

        String lowerCaseUsingCharAt = convertToLowercaseUsingCharAt(userInput);

        boolean areEqual = compareStringsUsingCharAt(lowerCaseUsingBuiltIn, lowerCaseUsingCharAt);

        System.out.println("\nLowercase using built-in method: " + lowerCaseUsingBuiltIn);
        System.out.println("Lowercase using charAt method: " + lowerCaseUsingCharAt);
        System.out.println("Are both results equal? " + areEqual);
    }
}
