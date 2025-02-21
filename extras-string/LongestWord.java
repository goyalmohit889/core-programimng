import java.util.Scanner;

//  Find the Longest Word in a Sentence

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        longestWord(str);
    }
    public static void longestWord(String str) {
        String s[] = str.split(" ");
        int max = Integer.MIN_VALUE;
        int temp = max;
        int idx=0;
        for(int i=0;i<s.length;i++){
            max=s[i].length();
            if(max>temp){
                temp=max;
                idx=i;
            }
        }
        System.out.println("Largest word from the given String is: "+s[idx]+" of size: "+temp);
    }
    
}
