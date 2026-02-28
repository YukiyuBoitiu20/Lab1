import java.util.Scanner;

/**
 * This program reads three non-negative integers from the keyboard 
 * and displays them in increasing order using nested if statements.
 * 
 * @author David A. Rivera Ortiz
 * 
 * @version 1.0
 * 
 * @since 2026-02-27
 * 
 */
public class Sorting {

    public static void main(String[] args) {
        // Input with Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Declarations of one type on a single line
        int n1, n2, n3;
        int min, mid, max;
        
        // Prompt user and get inputs
        System.out.print("Enter the first number: ");
        n1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        n2 = keyboard.nextInt();
        System.out.print("Enter the third number: ");
        n3 = keyboard.nextInt();
        
        // Operations: Use nested ifs to determine min, mid, and max
        
        // Check if n1 is the smallest
        if (n1 <= n2 && n1 <= n3) {
            min = n1;
            // Nested if to sort the remaining two numbers
            if (n2 <= n3) {
                mid = n2;
                max = n3;
            } else {
                mid = n3;
                max = n2;
            }
        } 
        // Check if n2 is the smallest
        else if (n2 <= n1 && n2 <= n3) {
            min = n2;
            // Nested if to sort the remaining two numbers
            if (n1 <= n3) {
                mid = n1;
                max = n3;
            } else {
                mid = n3;
                max = n1;
            }
        } 
        // By default, n3 must be the smallest
        else {
            min = n3;
            // Nested if to sort the remaining two numbers
            if (n1 <= n2) {
                mid = n1;
                max = n2;
            } else {
                mid = n2;
                max = n1;
            }
        }
        
        // Output
        System.out.println("The inputs sorted smallest to largest are: " + min + " " + mid + " " + max);
        
        keyboard.close();
    }
}