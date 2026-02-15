
/**
 * Write a description of class CityInfo here.
 *
 * @author (David A Rivera Ortiz)
 * @version (02/15/2026)
 */

import java.util.Scanner;

public class CityInfo {
    public static void main(String[] args) {
        // Create the Scanner to read input
        Scanner keyboard = new Scanner(System.in);

        // Ask the user for a city name
        System.out.print("Enter a city: ");
        String city = keyboard.nextLine();

        // Perform the string operations required by the lab
        int length = city.length();
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();
        char firstChar = city.charAt(0);

        // Display the results
        System.out.println("The city entered has: " + length + " chars");
        System.out.println("In upper case: " + upper);
        System.out.println("In lower case: " + lower);
        System.out.println("First character: " + firstChar);
    }
}
