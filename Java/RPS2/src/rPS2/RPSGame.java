package rPS2;
/**
 * Models a game of RPS.
 */

import java.lang.Math;

public class RPSGame {
    public static final int ROCK = 1, PAPER = 2, SCISSORS = 3;
    private int compThrow;
    private int playerWins, computerWins;
    
    /**
     * constructor.
     * pre: none
     * post: A RPSGame object has been created
     */
    public RPSGame() {
        compThrow = (int)(3 * Math.random() + 1);   //1, 2, or 3
        playerWins = 0;
        computerWins = 0;
    }
    
    /**
     * Generates the computer's throw.
     * pre: none
     * post: The computer's throw has been made
     */
    public void makeComputerThrow() {
        compThrow = (int)(3 * Math.random() + 1);   //1, 2, or 3
    }
    
    /**
     * Returns the computer's throw.
     * pre: none
     * post: The computer's throw has been returned.
     * @return 
     */
    public int getCompThrow() {
        return(compThrow);
    }
    
    /**
     * Determines winner of the round.
     * pre: playerThrow is the integer 1, 2 or 3. name is a STring.
     * post: Displays a message indicating throws. Compares player's 
     * throw to computer's throw and displays a message indicating 
     * the winner.
     * @param playerThrow
     * @param name
     */
    public void announceWinner(int playerThrow, String name) {
        
        /* Inform player of throws */
        System.out.print(name + " throws ");
        switch (playerThrow) {
            case ROCK: System.out.println("ROCK."); break;
            case PAPER: System.out.println("PAPER."); break;
            case SCISSORS: System.out.println("SCISSORS."); break;
            default: System.out.println("Nothing."); break;     //debug purposes/Easter egg
        }
        
        System.out.print("Computer throws ");
        switch (compThrow) {
            case ROCK: System.out.println("ROCK."); break;
            case PAPER: System.out.println("PAPER."); break;
            case SCISSORS: System.out.println("SCISSORS"); break;
            default: System.out.println("Nothing."); break;
        }
        
        /* Determine and announce winner */
        if (playerThrow == ROCK && compThrow == ROCK) {
            System.out.println("It's a draw!");
        } else if (playerThrow == ROCK && compThrow == PAPER) {
            System.out.println("Computer wins!");
            computerWins += 1;
        } else if (playerThrow == ROCK && compThrow == SCISSORS) {
            System.out.println(name + " wins!");
            playerWins += 1;
        }
        
        if (playerThrow == PAPER && compThrow == ROCK) {
            System.out.println(name + " wins!");
            playerWins += 1;
        } else if (playerThrow == PAPER && compThrow == PAPER) {
            System.out.println("It's a draw!");
        } else if (playerThrow == PAPER && compThrow == SCISSORS) {
            System.out.println("Computer wins!");
            computerWins += 1;
        }
        
        if (playerThrow == SCISSORS && compThrow == ROCK) {
            System.out.println("Computer wins!");
            computerWins += 1;
        } else if (playerThrow == SCISSORS && compThrow == PAPER) {
            System.out.println(name + " wins!");
            playerWins += 1;
        } else if (playerThrow == SCISSORS && compThrow == SCISSORS) {
            System.out.println("It's a draw!");
        }
    }
    
    /**
     * Displays the overall winner.
     * pre: none
     * post: Computer and player wins compared and 
     * an overall winner announced
     * @param name
     */
    public void bigWinner(String name) {
        
        System.out.println("\n\n");
        System.out.println(name + " wins " + playerWins + "!");
        System.out.println("Computer wins " + computerWins + "!");
        if (computerWins > playerWins) {
            System.out.println("Computer wins!");
        } else if (playerWins > computerWins) {
            System.out.println(name + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}