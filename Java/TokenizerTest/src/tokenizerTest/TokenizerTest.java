package tokenizerTest;
/**
 * @author Mason Schmidgall.
 * BPA Java Training
 * 2/23/2015
 */
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerTest{
    
    public static void main(String[] args){
        File inputFile;
        String fileName;
        FileReader in;
        BufferedReader readFile;
        StringTokenizer sT;
        String token;
        String inputLine;
        String data;
        String finalOutput = "";
        Scanner input = new Scanner(System.in);
        
        /* get fileName */
        System.out.print("Enter the filename (including .txt extension): ");
        fileName = input.nextLine();
        System.out.print("Enter the Token: ");
        token = input.nextLine();
        System.out.println("Processing...");
        
        /* read the File */
        try {
            inputFile = new File(fileName);
            in = new FileReader(inputFile);
            readFile = new BufferedReader(in);
        
            while((inputLine = readFile.readLine()) != null){
                sT = new StringTokenizer(inputLine, token);
                while(sT.hasMoreTokens()){
                    data = sT.nextToken();
                    finalOutput = finalOutput + data + "\n";
                } 
            }
            readFile.close();
            in.close();
            
            System.out.println(finalOutput);
        } catch(FileNotFoundException e){
            System.out.println("The File could not be found!");
        } catch(IOException e){
            System.out.println("The File could not be read!");
        }
    }
}