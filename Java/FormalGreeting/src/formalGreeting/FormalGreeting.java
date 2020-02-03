/**
 * FormalGreeting.java
 * 
 * Mason Schmidgall
 * BPA Java Training
 * 12/06/14
 */

import java.util.Scanner;
import java.lang.String;

/**
 * The FormalGreeting class prompts user for their name and responds with a proper greeting
 */

public class FormalGreeting {
    public static void main(String[] args){
        
        String name;
        final String mr = ("mr");
        final String mrs = ("mrs");
        final String ms = ("ms");
        String comName;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        input.close();
        
        comName = name.toLowerCase();
        
        if (comName.startsWith(mr) == true) {
            System.out.println("Hello, Sir");
        } else if (comName.startsWith(mrs) == true || comName.startsWith(ms) == true) {
            System.out.println("Hello, Ma'am");
        } else {
            System.out.println("Hello, " + name);
        }
    }
}