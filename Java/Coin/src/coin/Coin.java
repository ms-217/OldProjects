/**
 * Coin class.
 */
import java.lang.Math;
import java.lang.Object;
public class Coin {
    private int faceUp = 0;     //default value = Heads
    
    /**
     * Returns the face that is showing on the coin (Heads = 0; Tails = 1)
     * pre: none
     * post: face that is up is returned
     */
    public int showFace() {
        return(faceUp);
    }
    
    /**
     * Assigns and Returns a random value for faceUp
     * pre: none
     * post: new faceUp is returned
     */
    public int flipCoin() {
        faceUp = (int)((1 - 0 + 1) * Math.random() + 0);    //random number for faceUp
        return(faceUp);
    }
    
    /**
     * Returns a string that represents the showFace object
     * pre: none
     * post: A sting representing the coin has been returned
     */
    public String toString() {
        String coinString;                              //Final returned string
        final String coinStringStart = "Coin is ";      //starting part of string
        
        if (faceUp == 0) {
            coinString = (coinStringStart + "Heads Up");
        } else {
            coinString = (coinStringStart + "Tails Up");
        }
        return(coinString);
    }
    
    /**
     * Testing: toString
     */
    public static void main(String[] args) {
        Coin nickel = new Coin();
        
        nickel.flipCoin();
        System.out.println(nickel);
    }
}