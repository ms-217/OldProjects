package rPS2;
/**
 * RPS2.java
 * Mason Schmidgall
 * BPA Java Training
 * 12/21/14
 */

import java.util.Scanner;
import static rPS2.RPSGame.PAPER;
import static rPS2.RPSGame.ROCK;
import static rPS2.RPSGame.SCISSORS;

/**
 * Computer plays Rock Paper Scissors against one player.
 */
public class RPS2 {
    
    public static void main(String[] args) {
        RPSGame rps = new RPSGame();
        RPSPlayer rpsOpponent = new RPSPlayer();
        String name;
        int rounds;
        int playerThrow;
        Scanner input = new Scanner(System.in);
        
        /* play RPS */
        System.out.print("What's Your name? ");
        name = input.nextLine();
        System.out.print("How many rounds? ");
        rounds = input.nextInt();
        for (int i = 0; i < rounds; i++) {
            System.out.print("\nEnter  your throw (ROCK=1,"
                    + " PAPER=2, SCISSORS=3): ");
            playerThrow = input.nextInt();
            /* check playerThrow */
            while (playerThrow < ROCK || playerThrow > SCISSORS) {
                System.out.print("Enter a valid throw: ");
                playerThrow = input.nextInt();
            }
            rpsOpponent.makeThrow(playerThrow);
            
            rps.makeComputerThrow();
            rps.announceWinner(rpsOpponent.getThrow(), name);
        }
        rps.bigWinner(name);
    }
}