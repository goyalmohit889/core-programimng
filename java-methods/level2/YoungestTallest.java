import java.util.Scanner;

//  Create a program to find the youngest friends among 3 Amar, 
//  Akbar and Anthony based on their ages and tallest among the 
//  friends based on their heights and display it

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[] = new int[3];
        float height[] = new float[3];
        String str[] = {"Amar","Akhbar","Anthony"};

        for(int i=0;i<3;i++){
            System.out.print("Enter the age of "+str[i]+": ");
            age[i] = sc.nextInt();
            System.out.print("Enter the height of "+str[i]+": ");
            height[i] = sc.nextFloat();
        }
        System.out.println("Youngest person is "+yongest(age,str));
        System.out.println("Tallest person is "+tallest(height,str));
    }
    public static String yongest(int age[],String str[]) {
        int yongest = Integer.MAX_VALUE;
        String s="";
        for(int i=0;i<3;i++){
            if(yongest>age[i]){
                yongest=age[i];
                s=str[i];
            }
        }
        return s+" with age "+yongest;
    }
    public static String tallest(float height[],String str[]) {
        float tallest = Integer.MIN_VALUE;
        String s = "";
        for(int i=0;i<3;i++){
            if(height[i]>tallest){
                tallest = height[i];
                s=str[i];
            }
        }
        return s+" with height "+tallest;
    }
}
