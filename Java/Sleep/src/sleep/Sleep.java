import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Mason Schmidgall
 * BPA Java Training
 * 11/29/2014
 * 
 * Sleep asks the user for their birth date and todays date.
 * It then uses it to calculate the approximate number of days the user has been
 * alive and number of hours slept. (assuming they sleep 8 hours a night).
 */

public class Sleep {
    
    public static void main(String[] args){
        
        int userBDayYear;   //User's Birthday year input
        int userBDayMonth;  //User's Birthday Month input
        int userBDayDay;    //User's Birthday Day input
        
        int userDateYear;   //User's Current year input
        int userDateMonth;  //User's Current Month input
        int userDateDay;    //User's Currnet Day input
        
        int daysAlive;      //total number of days user was alive
        int sleep;          //total hours of sleep
        Scanner input = new Scanner(System.in);
        NumberFormat number = NumberFormat.getNumberInstance();
        
        
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        userBDayYear = input.nextInt();
        System.out.print("Month: ");
        userBDayMonth = input.nextInt();
        System.out.print("Day: ");
        userBDayDay = input.nextInt();
        
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        userDateYear = input.nextInt();
        System.out.print("Month: ");
        userDateMonth = input.nextInt();
        System.out.print("Day: ");
        userDateDay = input.nextInt();
        input.close();
        
        
        daysAlive = (userDateYear - userBDayYear) * 365;
        daysAlive = daysAlive + ((userDateMonth - userBDayMonth) * 30);
        daysAlive = daysAlive + (userDateDay - userBDayDay);
        
        sleep = daysAlive * 8;
        
        System.out.println("You have been alive for " + number.format(daysAlive) + " days.");
        //System.out.print(number.format(daysAlive));
        //System.out.println(" days.");
        System.out.println("You have slept " + number.format(sleep) + " hours.");
        //System.out.print(number.format(sleep));
        //System.out.println(" hours.");
        System.out.println("Numbers are approximate");
    }
}