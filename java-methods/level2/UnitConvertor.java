import java.util.Scanner;

//  Extend or Create a UnitConvertor utility class similar to 
//  the one shown in the notes to do the following.  
//  Please define static methods for all the UnitConvertor class methods. E.g. 

public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter reading of Km: ");
        double km = sc.nextInt();
        System.out.print("Enter reading of mile: ");
        double mile = sc.nextDouble();
        System.out.print("Enter reading of feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter reading of meter: ");
        double meter = sc.nextDouble();

        System.out.println("convert kilometers to miles: "+convertKmToMiles(km));
        System.out.println("convert miles to kilometers: "+convertMilesToKm(mile));
        System.out.println("convert feet to meters: "+convertfeetTometer(feet));
        System.out.println("convert meters to feet: "+convertmeterTofeet(meter));        
    }
    public static double convertKmToMiles(double km){
        return km* 0.621371;
    }
    public static double convertMilesToKm(double mile){
        return mile*1.60934;
    }
    public static double convertfeetTometer(double feet){
        return feet*3.28084;
    }
    public static double convertmeterTofeet(double meter){
        return meter*0.3048;
    }

}
