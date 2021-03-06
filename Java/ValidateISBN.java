package validateISBN;
import java.io.*;
import java.lang.Character;
/**
 * 
 * @author 30-0144-0017
 * This class contains the main() Method
 */
public class ValidateISBN {
    
    /**
     * Checks if ISBN is valid and returns false if invalid.
     * pre: inputNum is a String containing an ISBN with dashes
     * post: The validity of the ISBN has been returned
     * @param inputNum
     * @return valid
     */
    public static boolean checkISBN(String inputNum) {
        /* Digits of the ISBN, where the number corrosponds to weight*/
        int dig10, dig9, dig8, dig7, dig6, dig5, dig4, dig3, dig2, dig1;
        
        char[] inputDig;    //Digit array of ISBN
        boolean valid;
        int checkNum;
        
        /* save values from array to dig varibles */
        inputDig = inputNum.toCharArray();
        dig10 = Character.getNumericValue(inputDig[0]);
        dig9 = Character.getNumericValue(inputDig[2]); //Dash at index 1
        dig8 = Character.getNumericValue(inputDig[3]);
        dig7 = Character.getNumericValue(inputDig[4]); //Dash at index 5
        dig6 = Character.getNumericValue(inputDig[6]);
        dig5 = Character.getNumericValue(inputDig[7]);
        dig4 = Character.getNumericValue(inputDig[8]);
        dig3 = Character.getNumericValue(inputDig[9]);
        dig2 = Character.getNumericValue(inputDig[10]);    //Dash at index 11
        if(inputDig[12] == 'X') {
            dig1 = 10;
        } else {
            dig1 = Character.getNumericValue(inputDig[12]);
        }
        
        /* calc check number */
        checkNum = (dig10 * 10) + (dig9 * 9) + (dig8 * 8) + (dig7 * 7) +
                (dig6 * 6) + (dig5 * 5) + (dig4 * 4) + (dig3 * 3) + 
                (dig2 * 2) + dig1;
        
        /* check check number for validity */
        valid = checkNum % 11 == 0;
        return(valid);
    }
    
    public static void main(String[] args) {
        int processed = 0;
        int numInvalid = 0;
        File inputFile = new File("input340.txt");
        File outputFile = new File("output340.txt");
        FileReader in;
        BufferedReader readFile;
        FileWriter out;
        BufferedWriter writeFile;
        String ISBN;
        
        try {
            in = new FileReader(inputFile);
            readFile = new BufferedReader(in);
            out = new FileWriter(outputFile);
            writeFile = new BufferedWriter(out);
            
            /* Process ISBN's */
            while((ISBN = readFile.readLine()) != null) {
                processed += 1;
                if(checkISBN(ISBN) == false) {
                    writeFile.write(ISBN);
                    writeFile.newLine();
                    numInvalid += 1;
                }
            }
        
        /*Shows amount processed/invalid*/
        System.out.println("Processed: " + processed);
        System.out.println("Amount Invalid: " + numInvalid);
        
        /* close streams */
            writeFile.close();
            out.close();
            readFile.close();
            in.close();
            
        } catch (IOException e) {
            System.out.println("The Files could not be opened/read");
            System.exit(1);
        } 
        
     
    }
}