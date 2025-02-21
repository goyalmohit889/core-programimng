import java.util.Scanner;

//  Most Frequent Character

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        frequence(str);
    }
    public static void frequence(String str) {
        char []ch = new char[26];
        int max =Integer.MIN_VALUE;
        
        char c =' ';
        for (int i = 0; i < str.length(); i++) {
             c = str.charAt(i);
            if(c==' ') continue;
            ch[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ch[i]>max){
                max=ch[i];
                c=(char)(i+'a');
            }
        }
        System.out.println("Max frequency is "+max+" of character "+c);
    }
}
