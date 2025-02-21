import java.util.Scanner;

//  lexicographical order

public class lexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2: ");
        String str2 = sc.nextLine();
        String str = lexicographical(str1, str2);
        System.out.println(str);
    }
    public static String lexicographical(String str1,String str2) {
        // char arr1[] = str1.toCharArray();
        // char arr2[] = str2.toCharArray();
        
        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i]>arr2[i]){
        //         System.out.println(str2+" comes before "+str1+" in lexicographical order");
        //         break;
        //     }
        //     else{
        //         System.out.println(str1+" comes before "+str2+" in lexicographical order");
        //         break;
        //     }
        // }

        String r ="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>str2.charAt(i)){
                r=str2+" comes before "+str1+" in lexicographical order";
                return r;
            }
        }
            r= str1+" comes before "+str2+" in lexicographical order";
            return r;
    }
}
