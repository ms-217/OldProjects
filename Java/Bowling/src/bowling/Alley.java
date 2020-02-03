package bowling;
/**
 * Alley Class.
 */
public class Alley {
    private int pinsUp;
    private int pinsDown;
    
    /**
     * constructor.
     * pre: none
     * post: An Alley is created
     */
    public Alley() {
        pinsUp = 10;
        pinsDown = 10 - pinsUp;
    }
    
    /**
     * Returns the value of pinsUp.
     * pre: none
     * post: The value of pinsUp has been returned.
     * @return
     */
    public int showPins() {
        return(pinsUp);
    }
    
    /**
     * Returns 
     */
    
    /**
     * Changes the value of pinsUp.
     * pre: p is an int 0 - 10 inclusive.
     * post: the value of pinsUp is changed.
     * @param p
     */
    public void setPins(int p) {
        pinsUp = p;
        pinsDown = 10 - pinsUp;
    }
    
    /**
     * Adds to the value of pinsDown.
     * pre: p is an int 0 - 10 inclusive.
     * post: The value of pinsDown was increased.
     * @param p
     */
    public void knockDownPins(int p) {
        pinsDown += p;
        pinsUp = 10 - pinsDown;
    }
}