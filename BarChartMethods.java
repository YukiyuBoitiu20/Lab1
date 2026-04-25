import java.util.Random;

/**
 * Generates three random integers and prints a bar chart using methods.
 * * @author David Rivera Ortiz
 * @version 1.0
 * @since 2026-03-04
 */
public class BarChartMethods {
    public static void main(String[] args) {
        // just laying out our variables for the three numbers
        int first, second, third;
        
        // firing up the random number generator
        Random generator = new Random();

        // time to actually generate some random values between 0 and 999
        first = generator.nextInt(1000);
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);

        // spitting out the raw numbers so we know what we're working with
        System.out.println("Number 1 is: " + first);
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);
        System.out.println();

        // getting the chart header out there
        System.out.println("NUMBER BAR CHART");

        // printing the stars for the first number
        System.out.print("Number 1: ");
        printStars(first);

        // doing the same for the second number
        System.out.print("Number 2: ");
        printStars(second);

        // wrapping it up with the third number
        System.out.print("Number 3: ");
        printStars(third);
    }

    /**
     * Takes an integer and prints out one star for every hundred.
     * * @param input the number we are evaluating to print stars for
     */
    public static void printStars(int input) {
        // checking if we even have enough to print a star
        if (input < 100) {
            System.out.println("<100 no stars");
        } else {
            // looping through to print a star for every hundred using integer division
            for (int i = 0; i < (input / 100); i++) {
                System.out.print("*");
            }
            // bumping down to the next line when we're done
            System.out.println();
        }
    }
}