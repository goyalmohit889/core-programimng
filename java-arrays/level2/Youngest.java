import java.util.Scanner;

//  Create a program to find the youngest friends among 3
//  Amar, Akbar, and Anthony based on their ages and the 
//  tallest among the friends based on their heights


public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[] = new int[3];
        float height[] = new float[3];
        int a=Integer.MAX_VALUE;
        int h=0;
        int aa=0;
        float hh = 0;
        String str[] = {"Amar","Akhbar","Anthony"};
        for(int i=0;i<3;i++){
            System.out.print("Enter the age of "+str[i]+": ");
            age[i] = sc.nextInt();
            System.out.print("Enter the height of "+str[i]+": ");
            height[i] = sc.nextFloat();
            if(a>age[i]){
                a=i;
                aa=age[i];

            }
            if(h<height[i]){
                h=i;
                hh=height[i];
            }
        }
        System.out.println("Tallest height is: "+hh+" of "+str[h]);
        System.out.println("Yongest age is: "+aa+" of "+str[a]);
    }
}
