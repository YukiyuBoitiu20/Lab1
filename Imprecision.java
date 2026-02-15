
/**
 * Write a description of class Imprecision here.
 *
 * @author (David Rivera Ortiz)
 * @version (02/14/2026)
 */
public class Imprecision {
    public static void main(String[] args) {
        // Define the variables
        double x = 12345.6789e200;
        double y = 1 / x;
        double z = x * y;

        // Display the results
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z (x*y) is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    }
}
  