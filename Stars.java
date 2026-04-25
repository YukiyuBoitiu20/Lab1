import java.util.Scanner;

/**
 * Asks the user for a maximum width and prints a diamond shape using stars. 
 * Automatically adjusts even numbers up to the next odd number for symmetry.
 * @author David Rivera Ortiz
 * @version 1.0
 * @since 2026-03-07
 */
public class Stars { 
    public static void main(String[] args) {
        // setting up our integer variables on one line
        int width, line, spaces, stars;
        
        // firing up the scanner to grab input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // asking the user how wide they want this diamond to be
        System.out.print("Enter max width for stars: ");
        width = keyboard.nextInt();
        
        // checking if the width is even, and bumping it up by 1 if it is
        if (width % 2 == 0) {
            width++;
        }
        
        // printing the top half of the diamond
        for (line = 1, spaces = width / 2; line <= (width / 2) + 1; line++, spaces--) {
            
            // throwing in the right amount of spaces before the stars
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            
            // dropping the stars for this specific line
            for (stars = 1; stars <= (line * 2) - 1; stars++) {
                System.out.print("*");
            }
            
            // bumping down to the next line
            System.out.println();
        }
        
        // moving on to the bottom half of the diamond
        for (line = width / 2, spaces = 1; line > 0; line--, spaces++) {
            
            // pushing the stars over with some spaces
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            
            // printing out the decreasing number of stars
            for (stars = 1; stars <= (line * 2) - 1; stars++) {
                System.out.print("*");
            }
            
            // dropping down to start the next row
            System.out.println();
        }
        
        // closing out the scanner to keep things clean
        keyboard.close();
    }
}