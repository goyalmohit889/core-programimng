import java.util.Scanner;

//  Find Substring Occurrences

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter sunstring to find: ");
        String substring = sc.next();
        
        int count = countSubstring(str, substring);
        System.out.println("The substring '" + substring + "' occurs " + count + " times.");
    }

    public static int countSubstring(String str, String substring) {
        int count=0;
        String s[] = str.split(" ");
        for(String ss:s){
            if(ss.equals(substring)){
                count++;
            }
        }

        return count;
    }
}
