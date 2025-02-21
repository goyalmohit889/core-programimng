import java.util.Scanner;

//  Remove Duplicates from a String

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        duplicate(str);
    }
    public static void duplicate(String str) {
        String result = ""; 
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch)==-1){
                result +=ch;
            }
        }
        System.out.println("String after removing the duplicates: "+result);
    }
}
