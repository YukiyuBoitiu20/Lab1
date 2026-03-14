import java.util.Scanner;

/**
 * Evaluates whether user-provided whole numbers are prime or not.
 * * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-03-14
 */
public class Prime { 
    
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean isPrime;
        int number;            
        String playAgain;      

        // The do-while loop ensures the user gets to play at least once before we ask them if they want to stop[cite: 22].
        do { 
            // Get the number to test[cite: 26].
            System.out.print("Enter a whole number>2 (ie 19) to test if prime: ");
            number = keyboard.nextInt(); 
            // This extra nextLine() catches the "Enter" key press left behind by nextInt().
            keyboard.nextLine(); 
            
            // Send the number to our testing method and store the true/false result[cite: 23].
            isPrime = testForPrime(number);
            
            // Tell the user what we found[cite: 20].
            if (isPrime) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
            
            // Ask if they want to go another round[cite: 21, 28].
            System.out.print("Enter yes to test another number, no to quit. ");
            playAgain = keyboard.nextLine();    
            
        // We use equalsIgnoreCase so it works whether they type "YES", "yes", or "Yes".
        } while (playAgain.equalsIgnoreCase("yes")); 
        
        keyboard.close();
    }

    /**
     * Tests a whole number to determine if it is a prime number[cite: 23].
     * * @param number The whole number to be tested[cite: 23].
     * @return true if the number is prime, false if it is not[cite: 23].
     */
    public static boolean testForPrime(int number) {
        // Taking the square root speeds things up. If a number isn't divisible by anything up to its square root, it's prime!
        int inNumberSqRt = (int)Math.sqrt(number);  
        
        // We start by assuming the number is innocent (prime) until proven guilty.
        boolean isPrimeMeth = true;

        // Start checking at 2 (since everything is divisible by 1). 
        // The loop stops early if we find out it's NOT prime (isPrimeMeth becomes false).
        for(int i = 2; isPrimeMeth && i <= inNumberSqRt; i++) {  
           // The modulo operator (%) checks for a remainder. If it's 0, it divided evenly, so it's not prime.
           if (number % i == 0) {
               isPrimeMeth = false;
           }
        }
        return isPrimeMeth;
    }
}