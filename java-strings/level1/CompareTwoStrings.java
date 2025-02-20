import java.util.Scanner;

//  Write a program to compare two strings using the charAt() 
//  method and check the result with the built-in String equals() method

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String s1 = sc.next();
        System.out.println("Enter String2");
        String s2 = sc.next();
        boolean ischeck = stringCheck(s1, s2);
        boolean stringCheck = s1.equals(s2);
        System.out.println("String letter check: "+ischeck);
        System.out.println("String check: "+stringCheck);
        
    }
    public static boolean  stringCheck(String s1,String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
