import java.util.Scanner;

//  Write a program SpringSeason that takes two int values month 
//  and day from the command line and prints “Its a Spring Season”
//  otherwise prints “Not a Spring Season”. 

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month no.: " );
        int month = sc.nextInt();
        System.out.print("Enter date: ");
        int date = sc.nextInt();
        spring(month, date);
    }
    public static void spring(int month, int date) {
        if(month>3 && month<6 && date<=30){
            System.out.println("it's a spring season");
        }
        else if((month==3 && date>19) || (month==6 && date<21)){
            System.out.println("it's a spring season");
        }
        else{
            System.out.println("it's not a spring season");
        }
    }
}
