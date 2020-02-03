import java.util.Scanner;
import java.lang.Object;
/**
 * Line.java
 */

public class Line {
    private double slope;
    private double yInt;
    
    /**
     * constructor
     * pre: none
     * post: a Line object created. Slope and Y intercept initialized to 1.
     */
    public Line() {
        slope = 1;
        yInt = 1;
    }
    
    /**
     * constructor
     * pre: none
     * post: a Line object is created with Slope s and Intercept yI
     */
    public Line(double s, double yI) {
        slope = s;
        yInt = yI;
    }
    
    /**
     * Changes the slope of the Line
     * pre: none
     * post: slope of Line object has been changed
     */
    public void setSlope(double newSlope) {
        slope = newSlope;
    }
    
    /**
     * Changes the Y Intercept of the line
     * pre: none
     * post: yInt of Line object has been changed
     */
    public void setYInt(double newYInt) {
        yInt = newYInt;
    }
    
    /**
     * Changes BOTH yInt and slope of the line
     * pre: none
     * post: yInt and slope of Line has been changed
     */
    public void setLine(double setSlope, double setYInt) {
        slope = setSlope;
        yInt = setYInt;
    }
    
    /**
     * Returns the slope of the Line
     * pre: none
     * post: slope of Line is returned
     */
    public double getSlope() {
        return(slope);
    }
    
    /**
     * Returns the yInt of the Line
     * pre: none
     * post: yInt of Line is returned
     */
    public double getYInt() {
        return(yInt);
    }
    
    /**
     * Returns a string to represent the Line object
     * pre: none
     * post: a string representing the Line object has been returned
     */
    public String toString() {
        String lineString;
        
        lineString = "Line has slope: " + slope + "\nLine has "
                + "Y Intercept: " + yInt;
        return(lineString);
    }
    
    /**
     * Determines if the object is equal to another Line object
     * pre: l is a Line object
     * post: true has been returned if the objects have
     * the same slope and yInt. false is returned otherwise.
     */
    public boolean equals(Object l) {
        Line testObj = (Line)l;
        
        if (testObj.getSlope() == slope && testObj.getYInt() == yInt) {
            return(true);
        } else {
            return(false);
        }
    }
    
    /**
     * Calculates the perpendicular line with given x, y value
     * and sets the resulting line for the Line that was checked
     * pre: none
     * post: The New line's slope and YInt is saved in the line that
     * was checked
     */
    public void testing(double x, double y, Object l) {
        Line newLine = (Line)l;
        double newSlope = newLine.
    }
    
    /**
     * Testing Method(s): Line, getSlope, getYInt, toString, equals
     */
    public static void main(String[] args) {
        Line line1 = new Line(2, 3);
        Line line2 = new Line(2, 4);
        Line line3 = new Line(2, 4);
        Line line4 = new Line();
        
        System.out.println("TESTING: ");
        
        if (line3.equals(line2)) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
        System.out.println(line3);
        System.out.println(line2);
    }
}