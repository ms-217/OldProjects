/**
 * AccountSetup.java
 * 
 * Mason Schmidgall
 * BPA Java Training
 * 12/03/14
 */
import java.lang.String;
import java.util.Scanner;

/**
 * AccountSteup.java asks the user for an username and password
 */

public class AccountSetup {
    
    public static void main(String[] args) {
        
        String username, password;
        int passLength;
        Scanner input = new Scanner(System.in);
        
        /*Prompts user for username/password*/
        System.out.print("Enter a Username: ");
        username = input.nextLine();
        System.out.print("Enter a Password 8 or more characters long: ");
        password = input.nextLine();
        
        passLength = password.length();
        
        /*Loop until valid password is given*/
        while (passLength < 8) {
            System.out.print("Password must be 8 or more Characters: ");
            password = input.nextLine();
            passLength = password.length();
        }
        input.close();
        
        /*Display password lowercase*/
        username = username.toLowerCase();
        password = password.toLowerCase();
        System.out.println("\nUsername: " + username);
        System.out.println("Password: " + password);
        
    }
}