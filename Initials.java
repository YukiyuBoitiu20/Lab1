
/**
 * Write a description of class Initials here.
 *
 * @author (David A. Rivera Ortiz)
 * @version (02/15/2026)
 */
import java.util.Scanner; // This tool allows us to read what you type

public class Initials {
    public static void main(String[] args) {
        // Create the Scanner to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // 1. Ask for the First Name
        System.out.print("Enter your first name: ");
        String firstName = keyboard.nextLine();

        // 2. Ask for the Middle Name
        System.out.print("Enter your middle name: ");
        String middleName = keyboard.nextLine();

        // 3. Ask for the Last Name
        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();

        // Get the first letter of each name
        char firstInit = firstName.charAt(0);
        char middleInit = middleName.charAt(0);
        char lastInit = lastName.charAt(0);

        // Print the results
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);
    }
}