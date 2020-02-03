import java.util.Scanner;
/**
 * Mason Schmidgall
 * BPA Java Training
 * 11/27/14
 * 
 * CircleCircumference calculates and displays the Circumference
 * of a circle and displays result to the output
 * The user is prompted for a radius
 */

class Circumference {
    public static void main(String[] args){
        
        final double Pi = 3.14;
        double radius;  //User inputed radius
        double circum;  //result returned to user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
        input.close();
        
        if (radius < 0) {   //if Negative
            System.out.println("Negative radii are illegal!");
        } else {
            circum = Pi * (radius * radius);
            System.out.println("The Circumference is: " + circum);
        }
    }
}