//  Extend or Create a UnitConvertor utility class similar to the 
//  one shown in the notes to do the following.  
//  Please define static methods for all the UnitConvertor class methods

public class UnitConvertor2 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet / 3;
    }
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
    
    public static void main(String[] args) {
        double yards = 3;
        double feet = 0.333333;
        double meters = 5;
        double inches = 10;

        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}
