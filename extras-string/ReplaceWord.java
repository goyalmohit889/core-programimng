import java.util.Scanner;


//  Write a replace method in Java that replaces a given word with 
//  another word in a sentence:
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentance: ");
        String str = sc.nextLine();
        System.out.print("Enter word you want to replace: ");
        String word = sc.nextLine();
        System.out.print("Enter new word: ");
        String rp = sc.nextLine();
        System.out.println("String after changes is: "+replace(str, word, rp));
    }
    public static String replace(String str, String word,String rp) {
        String s[]=str.split(" ");
        String ss="";
        for(int i=0;i<s.length;i++){
            if(s[i].equals(word)){
                s[i]=rp;
                ss+=s[i]+" ";
            }
            else ss+=s[i]+" ";
        }
        return ss;
        
    }
}
