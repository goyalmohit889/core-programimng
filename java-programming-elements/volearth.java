// package Asgmday1;

//  Write a Program to compute the volume of Earth in km^3 and miles^3

public class volearth {

    public static void main(String[] args) {
        double radiusKm = 6371;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double km3ToMiles3 = 0.239913;
        double volumeMiles3 = volumeKm3 * km3ToMiles3;
        System.out.printf("Volume of Earth: %.2f km and cubic miles is %.2f ", volumeKm3,volumeMiles3);
        
    }
}

