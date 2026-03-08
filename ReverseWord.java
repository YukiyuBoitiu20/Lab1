import java.util.Scanner;

/**
 * Reads a line of words and checks if moving the first letter to the end 
 * and reversing the result equals the original word. Stops when quit is entered.
 * 
 * @author David Rivera Ortiz 
 * 
 * @version 1.0
 * 
 * @since 2026-03-06
 */
public class ReverseWord {
    public static void main(String[] args) {
        // setting up all our string variables on one line
        String word, remaining, combined, flipped, repeatChoice;
        
        // starting the char for the first letter empty
        char firstLetter = ' ';

        // bringing in the scanner for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // outer loop to keep running lines of text if we want to
        do {
            // telling the user what to do
            System.out.print("Enter words separated by a space ending with the word quit: ");
            
            // grabbing the very first word and forcing lowercase so it's easy to test
            word = keyboard.next().toLowerCase();

            // jumping into the while pit to process words until they type quit
            while (!word.equals("quit")) {
                // clearing out our holding variables for the new word
                combined = "";
                flipped = "";

                // snagging the first letter of the word
                firstLetter = word.charAt(0);
                
                // grabbing everything except the first letter
                remaining = word.substring(1);
                
                // sticking that first letter on the very end
                combined = remaining + firstLetter;

                // looping backwards through the combined word to flip it around
                for (int i = combined.length() - 1; i >= 0; i--) {
                    flipped += combined.charAt(i);
                }

                // checking if our flipped word perfectly matches the original
                if (flipped.equals(word)) {
                    System.out.println(word + " works");
                } else {
                    System.out.println(word + " does not work");
                }

                // getting the next word in the line before we loop again
                word = keyboard.next().toLowerCase();
            }

            // asking if they want to process another full line
            System.out.print("Enter yes to process another line? ");
            repeatChoice = keyboard.next();

        // keeping the big loop alive if they say yes
        } while (repeatChoice.equalsIgnoreCase("yes"));
        
        // keeping things tidy by closing the scanner
        keyboard.close();
    }
}