/**
 * WordGuess.java
 * 
 * Mason Schmidgall
 * BPA Java Training
 * 12/07/14
 */
import java.lang.String;
import java.util.Scanner;

/**
 * The WordGuess class prompts a user for letters to guess word
 */

public class WordGuess {
    public static void main(String[] args) {
        final String FLAG = ("!");
        final String SECRET_WORD = "BRAIN";
        String wordSoFar = "", updatedWord = "";
        String letterGuess, wordGuess = "";
        int numGuesses = 0;
        int score = 110;
        Scanner input = new Scanner(System.in);
        
        /*Start The Game*/
        System.out.println("Word Guess Game:\n");
        for (int i = 0; i < SECRET_WORD.length(); i++) {
            wordSoFar += "-";
        }
        System.out.println(wordSoFar + "\n");
        
        /*Let Player make guesses*/
        do {
            score -= 10;
            System.out.print("Enter a letter(" + FLAG + " to guess word): ");
            letterGuess = input.nextLine();
            letterGuess = letterGuess.toUpperCase();
            
            /*increment number of guesses*/
            numGuesses += 1;
            
            if (letterGuess.length() >= 2) {
                letterGuess = (FLAG);
            } else {
                /*If player guesses correctly*/
                if (SECRET_WORD.indexOf(letterGuess) >= 0) {
                    updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess));
                    updatedWord += letterGuess;
                    updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess)+1,
                            wordSoFar.length());
                    wordSoFar = updatedWord;
                }
            }
            /* display guessed letter */
            System.out.println(wordSoFar + "\n");
        } while (!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD) && score > 10);
        
        /* Finish Game with message */
        if (letterGuess.equals(FLAG)) {
            System.out.println("What is your guess? ");
            wordGuess = input.nextLine();
            wordGuess = wordGuess.toUpperCase();
        }
        if (wordGuess.equals(SECRET_WORD) || wordSoFar.equals(SECRET_WORD)) {
            System.out.println("You Win!!");
            if (score == 0){
                score = 10;
            }
        } else if (!letterGuess.equals(FLAG)) {
            System.out.println("You Lose");
            score = 0;
        } else {
            System.out.println("You Lose");
            score = 0;
        }
        input.close();
        System.out.println("The secret word is " + SECRET_WORD);
        System.out.println("You made " + numGuesses + " guesses");
        System.out.println("Score: " + score);
    }
}