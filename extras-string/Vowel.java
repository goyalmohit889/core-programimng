//  Count Vowels and Consonants

public class Vowel{
    public static void main(String[] args) {
        String str = "Mohit Goyal";
        int n = str.length();
        int c=0;
        int v=0;
        for(char ch :str.toCharArray()){
            if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'|| ch=='O'|| ch=='U'){
                v++;
            }
            else{
                if(ch==' '){
                    continue;
                }
                c++;
            }
        }
        System.out.println("count of vowels: "+v);
        System.out.println("count of Consonants: "+c);
    }
}