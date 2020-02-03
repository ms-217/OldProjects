package rPS2;
/**
 * models the player in a game of RPS.
 */

public class RPSPlayer {
    private int playerThrow;    //Rock = 1, Paper = 2, Scissors = 3
    private String playerName;
    
    /**
     * constructor.
     * pre: none
     * post: a Player is created
     */
    public RPSPlayer() {
        playerThrow = 0;        //Default Throw (set to 0 to see if throw made)
        playerName = "Player";  //Default Player name: Player
    }
    
    /**
     * Assigns a Name to the player.
     * pre: name is a string.
     * post: Player has been assigned a name.
     * @param name
     */
    public void assignName(String name) {
        playerName = name;
    }
    
    /**
     * Returns the name of the player.
     * pre: none
     * post: Player name has been returned
     * @return playerName
     */
    public String getName() {
        return(playerName);
    }
    
    /**
     * Prompts the player for throw.
     * pre: newThrow must be int 1, 2, or 3
     * post: Player's throw has been made.
     * @param newThrow
     */
    public void makeThrow(int newThrow) {
        playerThrow = newThrow;
    }
    
    /**
     * Returns the Player's Throw.
     * pre: none
     * post: The player's throw has been returned.
     * @return 
     */
    public int getThrow() {
        return(playerThrow);
    }
}