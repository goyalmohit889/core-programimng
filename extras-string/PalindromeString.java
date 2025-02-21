import java.util.Scanner;

//  3. Palindrome String Check

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        palindrome(str);
    }
    public static void palindrome(String str) {
        char ch[] = str.toCharArray();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+ch[i];
        }
        if(str.equals(rev)){
            System.out.println("The given String is Palindrome");
        }
        else{
            System.out.println("The given String is not Palindrome");
        }
    }
}
