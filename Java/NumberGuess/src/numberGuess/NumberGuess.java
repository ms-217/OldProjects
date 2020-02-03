/**
 * NumberGuess.java
 * 
 * Mason Schmidgall
 * BPA Java Training
 * 11/30/14
 */
import java.util.Scanner;
import java.lang.Math;

/**
 * The NumberGuess class generates a random number and asks the player to guess what
 * it is once, tells them high or low, and lets them guess again
 */

public class NumberGuess {
   
    public static void main(String[] args) {
        
        int guess1; //Player's First Guess
        int guess2; //Player's Second Guess
        int guess3; //Player's Third Guess
        //int distance1;  //Distance Random Number is from First guess
        int distance2;  //Distance Random Number is from Second guess
        //int distance3;  //Difference of Distance 1 & 2 (in abs)
        int randomNum;  //Random Number Generated
        Scanner input = new Scanner(System.in);
        
        randomNum = (int)((100 * Math.random()) + 1);   //generates random number 1-100
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Guess a number 1-100: ");
        guess1 = input.nextInt();
        
        if (guess1 == randomNum) {  //Correct Guess
            System.out.println("Wow First try! The number was " + randomNum + "!");
            input.close();
        } else {
            if (guess1 <= 0 || guess1 > 100) {   //Invalid Guess
                System.out.println("Invalid guess 8/");
            } else if (guess1 < randomNum) {    //Low Guess
                System.out.println("Try again. You are too low!");
            } else if (guess1 > randomNum) {    //High Guess
                System.out.println("Try again. You are too high!");
            }
        
            System.out.print("Guess another number 1-100: ");
            guess2 = input.nextInt();
        
            if (guess2 == randomNum) {  //Correct Guess
                System.out.println("You Did it! The number was: " + randomNum);
                input.close();
            } else {
                if (guess2 <= 0 || guess2 > 100) {   //Invalid Guess
                    System.out.println("Invalid guess 8/");
                } else {
                    
                    //distance1 = Math.abs(guess1 - randomNum);
                    distance2 = Math.abs(guess2 - randomNum);
                    //distance3 = Math.abs(distance1 - distance2);
                    
                    if (distance2 < 5) {
                        System.out.println("You are within 5!");
                    } else if (distance2 < 10) {
                        System.out.println("You are within 10!");
                    } else if (distance2 < 20) {
                        System.out.println("You are within 20!");
                    } else if (distance2 < 30) {
                        System.out.println("You are within 30!");
                    } else if (distance2 < 40) {
                        System.out.println("You are within 40!");
                    } else if (distance2 < 50) {
                        System.out.println("You are within 50!");
                    } else {
                        System.out.println("You are nowhere near the number");
                    }
                    
                    System.out.print("\nLast Chance! pick a number 1-100: ");
                    guess3 = input.nextInt();
                    input.close();
                    
                    if (guess3 == randomNum) {
                        System.out.println("You did it! The number was: " + randomNum);
                    } else if (guess3 <= 0 || guess3 > 100) {
                        System.out.println("Invalid guess 8/");
                    } else {
                        System.out.println("Incorrect. The number was: " + randomNum);
                        System.out.println("You were " + (Math.abs(guess3 - randomNum)) + " Numbers off.");
                    }
                }
            }
        }
    }
}