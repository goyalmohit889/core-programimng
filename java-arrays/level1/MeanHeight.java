import java.util.Scanner;

//  Create a program to find the mean height of players present in a football team.

class MeanHeight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height[] = new double[11];
        double sum=0;
        System.out.println("Enter the height of 11 players");
        for(int i=0;i<11;i++){
            height[i]= sc.nextDouble();
            sum+=height[i];
        }
        System.out.printf("Mean height of 11 players is: %.2f",(sum/11));
    }
}