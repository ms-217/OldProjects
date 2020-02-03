/**
 * Quadratic solver
 * 
 * Do this later
 */

import java.util.Scanner;
import java.lang.Math;

public class QuadraticSolver {
    public static void main(String[] args){
        
        double a;
        double b;
        double c;
        double ds;
        double ansNegative;
        double ansPositive;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quadratic Formula Solver:");
        System.out.print("a: ");
        a = input.nextDouble();
        System.out.print("b: ");
        b = input.nextDouble();
        System.out.print("c: ");
        c = input.nextDouble();
        input.close();
        
        ds = (Math.pow(b, 2) - 4 * a * c);
        ansPositive = (((-1 * b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        ansNegative = (((-1 * b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        
        if (ds < 0) {
            System.out.println("No Real Solutions");
        } else if (ansPositive == ansNegative) {
            System.out.println("The real root is: " + ansPositive);
        } else {
            System.out.println("The roots are " + ansPositive + " and " + ansNegative);
        }
    }
}