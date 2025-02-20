import java.util.Scanner;

//  Write a program to create a substring from a String using 
//  the charAt() method. Also, use the String built-in method substring() 
//  to find the substring of the text. Finally Compare the the two strings 
//  and display the results

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        System.out.print("Enter starting index: ");
        int n = sc.nextInt();
        System.out.print("Enter ending index of substring: ");
        int n1 = sc.nextInt();
        String s=substring(str, n, n1);
        System.out.println("Result is:"+s);
        String s1 = str.substring(n, n1);
        System.out.println("Result of substring is:"+s1);
        boolean compare = s.equals(s1);
        System.out.println("Comperison of strings: "+compare);
    }
    public static String substring(String str,int n,int n1) {
        String str1 = "";
        for(int i=n;i<n1;i++){
            str1=str1+str.charAt(i);
        }
        return str1;
    }
}
