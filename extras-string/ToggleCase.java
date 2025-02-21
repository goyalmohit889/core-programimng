import java.util.Scanner;

//  Toggle Case of Characters

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        toggle(str);
        
    }
    public static void toggle(String str) {
        char[] ch = str.toCharArray();
        String s = "";
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                s+=(char)(ch[i]+32);
            }
            else if(ch[i]==' '){
                s+=" ";
            }
            else{
                s+=(char)(ch[i]-32);
            }
        }
        System.out.println(s);
    }
}
