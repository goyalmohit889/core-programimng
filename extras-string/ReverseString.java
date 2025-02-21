//  2. Reverse a String

public class ReverseString {
    public static void main(String[] args) {
        String str = "Mohit Goyal";
        char ch[] = str.toCharArray();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+ch[i];
        }
        System.out.println("Reversed String is: "+rev);
    }
}
