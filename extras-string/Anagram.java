import java.util.Arrays;
import java.util.Scanner;

//  Write a Java program that accepts two strings from the user and checks if the two
// strings are anagrams of each other (i.e., whether they contain the same characters in any
// order).

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2: ");
        String str2 = sc.nextLine();
        boolean b=anagrams(str1, str2);
        if(b) System.out.println("Anagram");
        else System.out.println("Not Anagram");

    }
    public static boolean  anagrams(String str1,String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedString1 = new String(arr1);
        String sortedString2 = new String(arr2);
        if(sortedString1.equals(sortedString2)){
            return true;
        }
        else return  false;
    }
}
