package assignment;
import java.util.Scanner;
import java.io.*;

public class Assignment {
    public static void main(String[] args) {
        File assignment = new File("assignment.txt");
        FileReader in;
        BufferedReader readFile;
        String lineOfTxt;
        
        try {
            in = new FileReader(assignment);
            readFile = new BufferedReader(in);
            while ((lineOfTxt = readFile.readLine()) != null) {
                System.out.println(lineOfTxt);
            }
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: "
                    + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading File.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}