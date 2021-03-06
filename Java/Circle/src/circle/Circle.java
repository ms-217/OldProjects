import java.lang.Object;
/**
 * Circle class
 */
public class Circle {
    private static final double PI = 3.14;
    private double radius;
    
    /**
     * constructor
     * pre: none
     * post: A circle object created. Radius initialized to 1
     */
    public Circle() {
        radius = 1;     //default radius
    }
    
    /**
     * constructor
     * pre: none
     * post: A Circle object is created with radius r.
     */
    public Circle(double r) {
        radius = r;
    }
    
    /**
     * Changes the radius of the circle
     * pre: none
     * post: Radius has been changed
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    /**
     * Calculates the area of the circle.
     * pre: none
     * post: The area of the circle has been returned
     */
    public double area() {
        double circleArea;
        
        circleArea = PI * radius * radius;
        return(circleArea);
    }
    
    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The radius of the circle is returned
     */
    public double getRadius() {
        return(radius);
    }
    
    /**
     * Calculates the circumference of the circle
     * pre: none
     * post: The Circumference of the circle has been returned
     */
    public double circumference() {
        double circumference;
        
        circumference = 2 * PI * radius;
        return(circumference);
    }
    
    /**
     * Displays the formula for the area of the circle
     * pre: none
     * post: The formula for area of a circle has been displayed
     */
    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a "
                + "circle is a=Pi*r*r");
    }
    
    /**
     * Determines if the object is equal to another Circle object
     * pre: c is a Circle object
     * post: True has been returned if the objects have
     * the same radii. false has been returned otherwise
     */
    public boolean equals(Object c) {
        Circle testObj = (Circle)c;
        
        if (testObj.getRadius() == radius) {
            return(true);
        } else {
            return(false);
        }
    }
    
    /**
     * Returns a string that represents the Circle object.
     * pre: none
     * post: A String representing the Circle objetc has
     * been returned.
     */
    public String toString() {
        String circleString;
        
        circleString = "Circle has radius " + radius;
        return(circleString);
    }
    
    /**
     * testing method(s): equals & toString
     */
    public static void main(String[] args) {
        Circle spot1 = new Circle(3);
        Circle spot2 = new Circle(4);
        
        if (spot1.equals(spot2)) {
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
        System.out.println(spot1);
        System.out.println(spot2);
    }
}