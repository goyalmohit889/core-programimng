import java.util.Scanner;

//  Write a program to return all the characters in a string using the 
//  user-defined method,  compare the result with the String built-in 
//  toCharArray() method, and display the result

public  class StringArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        char arr[] = str.toCharArray();
        char arr1[] = array(str);
        System.out.print("Elements of String built-in: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");    
        }
        System.out.println();
        System.out.print("Elements of String user-built: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");    
        }
        System.out.println();
        boolean arrCheck = check(arr, arr1);
        System.out.print("Check the both Array: "+arrCheck);
    }
    public static char[] array(String str) {
        char a[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            a[i] = str.charAt(i);
        }
        return a;
    }
    public static boolean  check(char arr[],char arr1[]) {
        for(int i=0;i<arr1.length;i++){
            if(arr[i]==arr1[i]){
                return true;
            }
        }
        return false;
    }
}
