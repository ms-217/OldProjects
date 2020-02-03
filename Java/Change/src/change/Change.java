import java.util.Scanner;
/**
 * Mason Schmidgall
 * BPA Java Training
 * 11/27/2014
 * 
 * Change shows the user the amount of coins needed
 * to generate the change of an amount
 */

public class Change {
    public static void main(String args){
        double price;
        double payment;
        double change;
        double changeLeft;
        int pennies;
        int nickels;
        int dimes;
        int quarters;
        int ones;
        int fives;
        int tens;
        int twenties;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter The price of the object: ");
        price = input.nextDouble();
        System.out.print("Enter The amount paid: ");
        payment = input.nextDouble();
        while(price > payment) {
            System.out.println("You need more money son!!");
            System.out.print("Enter The amount paid: ");
            payment = input.nextDouble();
        }
        
        System.out.println("Processing...");
        
        change = payment - price;
        changeLeft = change;
        
        if(change % 20 == 0) {
            twenties = (int) (change / 20);
            changeLeft = change - (twenties * 20);
        }
        if(changeLeft % 10 == 0) {
            tens = (int) (changeLeft / 10);
            changeLeft = changeLeft - (tens * 10);
        }
        if(changeLeft % 5 == 0) {
            fives = (int) (changeLeft / 5);
            changeLeft = changeLeft - (fives * 5);
        }
        if(changeLeft % 1 == 0) {
            ones = (int) (changeLeft / 1);
            changeLeft = changeLeft - (ones * 1);
        }
        if(changeLeft % 0.25 == 0 && ) {
            quarters = (int) (changeLeft / 0.25);
            changeLeft = changeLeft - (quarters * 0.25);
        }
        if(changeLeft % 0.1 == 0) {
            dimes = (int) (changeLeft / 0.1);
            changeLeft = changeLeft - (dimes * 0.1);
        }
        if(changeLeft % 0.05 == 0) {
            nickels = (int) (changeLeft / 0.05);
            changeLeft = changeLeft - (nickels * 0.05);
        }
        if(changeLeft % 0.01 == 0) {
            pennies = (int) (changeLeft / 0.01);
            changeLeft = changeLeft - (pennies * 0.01);
        }
    }
}