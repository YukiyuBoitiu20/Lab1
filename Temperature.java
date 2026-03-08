import java.util.Scanner;

/**
 * Converts temperatures between Fahrenheit and Celsius.
 * Traps the user in a loop if they provide invalid units, and repeats until they want to quit.
 * @author David Rivera Ortiz
 * 
 * 
 * @version 1.0
 * 
 * @since 2026-03-06
 * 
 */
public class Temperature {
    public static void main(String[] args) {
        // setting up our variables for the numbers and characters
        double inputTemp, outputTemp;
        char inputUnit;
        String repeatChoice;

        // firing up the scanner to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // starting the main loop so we can run this multiple times
        do {
            // telling the user exactly what we want from them
            System.out.print("Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ");
            inputTemp = keyboard.nextDouble();
            
            // grabbing the unit and forcing it to uppercase right away to make testing easier
            inputUnit = keyboard.next().toUpperCase().charAt(0);

            // tossing them into the while pit if they don't type C or F
            while (inputUnit != 'C' && inputUnit != 'F') {
                System.out.print("Enter C to convert to F or vice versa: ");
                inputUnit = keyboard.next().toUpperCase().charAt(0);
            }

            // doing the math depending on which letter they actually gave us
            if (inputUnit == 'F') {
                // converting Fahrenheit to Celsius
                outputTemp = (inputTemp - 32.0) * (5.0 / 9.0);
                
                // spitting out the result rounded to one decimal place
                System.out.printf("%.0fF converted is: %.1fC\n", inputTemp, outputTemp);
            } else {
                // converting Celsius to Fahrenheit
                outputTemp = (inputTemp * (9.0 / 5.0)) + 32.0;
                
                // spitting out the result rounded to one decimal place
                System.out.printf("%.0fC converted is: %.1fF\n", inputTemp, outputTemp);
            }

            // asking if they want to go for another round
            System.out.print("Do you want to calculate another temp? If so, enter yes otherwise no: ");
            repeatChoice = keyboard.next();

        // checking if they typed yes to keep the party going
        } while (repeatChoice.equalsIgnoreCase("yes"));
        
        // closing the scanner to be tidy (optional but good practice)
        keyboard.close();
    }
}