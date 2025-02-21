import java.util.Scanner;

// Remove a Specific Character from a String

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter character you want to remove: ");
        char c = sc.next().charAt(0);
        // String ss = removeChar(str, c);
        // System.out.println(ss);
        System.out.println("String after removed character: "+removeChar(str, c));
    }
    public static String removeChar(String str , char ch) {
        String s = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=ch){
                s+=c;
            }
        }
        return s;
    }
}
