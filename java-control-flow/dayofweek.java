// package Asgmday2;
import java.util.Scanner;

//  week that the date falls on. Your program should take three command-line arguments: m 
//  (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth.
//  For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use 
//  the following formulas, for the Gregorian calendar (where / denotes integer division):

public class dayofweek {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();  
                int d = sc.nextInt();  
                int y = sc.nextInt();  

                int y0 = y - (14 - m) / 12;
                int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
                int m0 = m + 12 * ((14 - m) / 12) - 2;
                int d0 = (d + x + 31 * m0 / 12+1) % 7;

                System.out.println(d0);
            }
        }
