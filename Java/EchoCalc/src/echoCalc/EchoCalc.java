
/**
 * EchoCalc
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class EchoCalc {
    public static void main(String[] args) {
        
        double speed;
        double time;
        double ansDistance;
        Scanner input = new Scanner(System.in);
        NumberFormat number = NumberFormat.getNumberInstance();
        
        System.out.println("Echo Distance Calculator:");
        System.out.print("Speed of Sound (M/S): ");
        speed = input.nextDouble();
        System.out.print("Time of echo (seconds): ");
        time = input.nextDouble();
        input.close();
        
        ansDistance = (time / 2) * speed;
        
        if (ansDistance < 0) {
            System.out.println("THAT'S FRIKEN NEGATIVE!");
        } else {
            System.out.println("Distance to wall: " + number.format(ansDistance) + " meters");
        }    
    }
}
    