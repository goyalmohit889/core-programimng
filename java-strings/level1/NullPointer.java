//  Write a program to demonstrate NullPointerException. 

public class NullPointer {
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: NullPointerException");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Handling NullPointerException:");
        handleNullPointerException(); 
    }
}


