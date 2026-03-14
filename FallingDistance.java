import java.util.Scanner;

/**
 * Calculates the falling distance of an object over a user-specified number of seconds.
 * * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-03-12
 */
public class FallingDistance { 
    
    // We lock in gravity here as a constant so it can't be changed anywhere else in the code[cite: 11].
    public static final double ACCELERATION = 9.8;  

    public static void main (String[] args) {
        // Setting up our tools: a scanner to read input, and some variables to hold our data.
        Scanner keyboard = new Scanner(System.in);
        double distance;
        int numOfSecs;
        
        // Grab the amount of time from the user[cite: 13].
        System.out.print("Please enter how many seconds to compute: ");
        numOfSecs = keyboard.nextInt();
        
        // Setting up the header for our table. The '\t' acts like hitting the 'Tab' key to line things up nicely[cite: 10, 17].
        System.out.println("\nTime (secs)\tDistance (m)");
        System.out.println("===========\t============");
        
        // This loop starts at 1 second and keeps going until it hits the total seconds the user entered[cite: 14].
        for (int i = 1; i <= numOfSecs; i++) {
            // Call our custom method below to do the heavy lifting for the math[cite: 10].
            distance = getDistance(i);
            
            // %d is for the integer (seconds), %.1f limits the distance to one decimal place, and \n moves to the next line[cite: 12].
            System.out.printf("%d\t\t%.1f\n", i, distance);
        }
        
        // Always close the scanner when you're done to free up resources!
        keyboard.close();
    } 

    /**
     * Calculates the distance an object falls in a given amount of time[cite: 10].
     * * @param t The time in seconds[cite: 10].
     * @return The distance fallen in meters[cite: 10].
     */
    public static double getDistance(int t) {
        // This is the formula: d = 0.5 * g * t^2. We use Math.pow to square the time[cite: 14, 15].
        return 0.5 * ACCELERATION * Math.pow(t, 2);
    }
}