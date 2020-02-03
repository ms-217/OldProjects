/**
 * Stages.java
 * 
 * Mason Schmidgall
 * BPA Java Training
 * 11/30/14
 */
import java.util.Scanner;
import java.text.Format;
import java.text.NumberFormat;

/**
 * The Stages class asks the user for thier age and puts them into an age group
 */

public class Stages{
    
    public static void main(String[] args){
        int age;
        Scanner input = new Scanner(System.in);
        NumberFormat number = NumberFormat.getNumberInstance();
        
        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.close();
        
        if (age < 0){   //Negative age filter
            age = age * -1;
            System.out.println("You will be born in " + number.format(age) + " years.");
        } else {
            if (age > 18){  //Adult = 18+
                System.out.println("You're an Adult");
            }
            if (age <= 18){     //Teen 13-18
                if (age <= 5){  //Toddler 0-5
                    System.out.println("You're a Toddler");
                } else {
                    if (age <= 10) {    //Child 6-10
                        System.out.println("You're a Child");
                    } else {
                        if (age <= 12){ //Preteen 11-12
                            System.out.println("You're a Preteen");
                        } else {
                            System.out.println("You're a Teen");
                        }
                    }
                }
            }
        }
    }
}