/**
 * Mason SChmidgall
 * BPA Java Training
 * 11/27/14
 * 
 * BingoCard creates a static Bingo Card and Displays
 * it to the output
 */

package bingoCard;

/**
 * The Card class should display several strings in columns
 */
public class Card{
    
    public static void main(String[] args) {
        System.out.format("%10s %10s %10s %10s %10s", "B", "I", "N", "G", "O\n" );
        System.out.format("%10s %10s %10s %10s %10s", "3", "18", "36", "47", "73\n");
        System.out.format("%10s %10s %10s %10s %10s", "10", "29", "42", "54", "75\n");
        System.out.format("%10s %10s %10s %10s %10s", "2", "25", "FREE", "50", "67\n");
        System.out.format("%10s %10s %10s %10s %10s", "14", "16", "40", "56", "61\n");
        System.out.format("%10s %10s %10s %10s %10s", "6", "21", "38", "60", "72\n");
    }
}