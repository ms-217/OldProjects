/**
 * PrimeNumber.java
 * 
 * Mason Schmidgall
 * BPA Java Training 
 * 12/07/14
 */
import java.util.Scanner;

/**
 * The PrimeNumber class prompts the user for a number, uses modulus division up to 
 * the number, and says if it's prime or not
 */
public class PrimeNumber {
    public static void main(String[] args) {
        
        int numIn;
        int numMod;
        boolean prime = true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Prime Number Checker:");
        System.out.print("Enter an integer: ");
        numIn = input.nextInt();
        
        for (int i = (numIn - 1); i > 1; i--) {
            numMod = numIn % i;
            
            if (numMod == 0) {
                prime = false;
                break;
            }
        }
        
        if (numIn <= 0 || numIn == 1) {
            System.out.println(numIn + " is neither");
        } else if (prime == true) {
            System.out.println(numIn + " is a prime number");
        } else {
            System.out.println(numIn + " is a composite number");
        }
    }
}