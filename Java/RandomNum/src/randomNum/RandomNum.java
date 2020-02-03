/**
 * RandomNum.java
 * 
 * Mason Schmidgall
 * BPA Java Training
 * 11/30/14
 */

import java.util.Scanner;
import java.text.Format;
import java.lang.Math;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Class RandomNum asks the user for a minimum and a maximum value and generates 
 * a random integer between them
 */

public class RandomNum {
    
    public static void main(String[] args){
        int min;
        int max;
        int randomNum;
        Scanner input = new Scanner(System.in);
        NumberFormat number = NumberFormat.getNumberInstance();
        
        System.out.println("Random Number Generator");
        System.out.print("Minimum value: ");
        min = input.nextInt();
        System.out.print("Maximum value: ");
        max = input.nextInt();
        input.close();
        
        randomNum = (int)((max - min + 1) * Math.random() + min);
        
        System.out.println("Random Number: " + number.format(randomNum));
    }
}