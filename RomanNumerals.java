import java.util.Scanner;

/**
 * This program asks the user to enter a number between 1 and 3
 * and displays the corresponding Roman numeral using a switch statement.
 * 
 * @author David A. Rivera Ortiz
 * 
 * @version 1.0
 * 
 * @since 2026-02-27
 * 
 */
public class RomanNumerals {

    public static void main(String[] args) {
        // Input with Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Declarations of one type on a single line
        int number;
        String romanNumeral;
        
        System.out.print("Enter a number between 1 and 3: ");
        number = keyboard.nextInt();
        
        // Operations
        switch (number) {
            case 1:
                romanNumeral = "I";
                break;
            case 2:
                romanNumeral = "II";
                break;
            case 3:
                romanNumeral = "III";
                break;
            default:
                romanNumeral = "Invalid";
        }
        
        // Output
        if (romanNumeral.equals("Invalid")) {
            System.out.println(number + " is not a valid number. It must be between 1 and 3.");
        } else {
            System.out.println("The Roman numeral is: " + romanNumeral);
        }
        
        keyboard.close();
    }
}