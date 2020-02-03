/**
 * DiscriminentSolver.java
 * 
 * Mason Schmidgall
 * BPA Java Training
 * 12/01/14
 */
import java.util.Scanner;
import java.lang.Math;

/**
 * The DiscriminentSolver class asks the user for a,b and c and solves it using
 * the discriminent formula: b^2 - 4ac. It also returns the amount of solutions
 * for the problem
 */

public class DiscriminentSolver {
    
    public static void main(String[] args) {
        
        double userA;
        double userB;
        double userC;
        double ans;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Discriminent Solver:");
        System.out.print("Enter value for a: ");
        userA = input.nextDouble();
        System.out.print("Enter value for b: ");
        userB = input.nextDouble();
        System.out.print("Enter value for c: ");
        userC = input.nextDouble();
        input.close();
        
        ans = (Math.pow(userB, 2) - 4 * userA * userC);
        
        if (ans < 0) {
            System.out.println("No Solutions");
        } else if (ans > 0) {
            System.out.println("Two Solutions");
        } else if (ans == 0) {
            System.out.println("One Solution");
        }
        
        System.out.println("The Discriminent was: " + ans);
    }
}