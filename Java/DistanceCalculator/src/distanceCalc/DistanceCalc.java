package distanceCalc;
/**
 * @author Mason Schmidgall
 * distanceCalc
 */

import java.util.Scanner;
import java.lang.Math;

public class DistanceCalc {
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;
        double distance;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Coordinate:");
        System.out.print("X: ");
        x1 = input.nextDouble();
        //while(x1 != -0) {
            System.out.print("Y: ");
            y1 = input.nextDouble();
            System.out.println("Enter Second Coordinate:");
            System.out.print("X: ");
            x2 = input.nextDouble();
            System.out.print("Y: ");
            y2 = input.nextDouble();
        //}
        distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        
        System.out.println("The distance is: " + distance);
    }
}