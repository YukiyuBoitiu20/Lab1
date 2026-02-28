import java.util.Scanner;

/**
 * 
 * This program reads a date in mm/dd/yyyy format and determines
 * if it is a valid date, checking for leap years and month lengths
 * .
 * @author David Rivera Ortiz
 * 
 * @version 1.0
 * 
 * @since 2026-02-27
 * 
 */
public class ValidDate {

    public static void main(String[] args) {
        // Input with Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Declarations of one type on a single line
        int month, day, year;
        String temp, output;
        boolean isValid, isLeapYear;
        
        // Initialization on one line
        output = "";
        isValid = false;
        
        // Changes the default scanner behavior to split input at the "/" i nstead of spaces
        keyboard.useDelimiter("/");
        
        System.out.print("Enter a date (mm/dd/yyyy): ");
        month = keyboard.nextInt();
        day = keyboard.nextInt();
        
        // .nextLine() grabs the rest of the buffer ( looks like "/2021")
        // .substring(1) cuts off the first character (the "/") leaving just the year text
        temp = keyboard.nextLine().substring(1);
        
        // Converts the String value in 'temp' into an actual integer number
        year = Integer.parseInt(temp);
        
        // Operations: Multibranch if-else if to check the days
        if (day < 1) {
            output = "Cannot have less than 1 day in a month.";
        } else if (day > 31) {
            output = "Cannot have more than 31 days in any month.";
        } else {
            // Switch statement to evaluate the specific month
            switch (month) {
                // Cases for all 31-day months (Intentional bleed-through)
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    isValid = true;
                    break;
                
                // Cases for all 30-day months
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day <= 30) {
                        isValid = true;
                    } else {
                        output = "Cannot have 31 days in this month.";
                    }
                    break;
                
                // Case for February
                case 2:
                    isLeapYear = false;
                    
                    // Modulus (%) checks for remainders. Used here to apply leap year math rules.
                    if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
                        isLeapYear = true;
                    }
                    
                    if (isLeapYear) {
                        if (day <= 29) {
                            isValid = true;
                        } else {
                            output = "Cannot have more than 29 days in a leap year.";
                        }
                    } else {
                        if (day <= 28) {
                            isValid = true;
                        } else {
                            output = "Cannot have 29 or more days in a non-leap year.";
                        }
                    }
                    break;
                
                // Default catches any month number outside of 1-12
                default:
                    output = "Months must be 1 to 12.";
            }
        }
        
        // Output section
        if (isValid) {
            System.out.println(month + "/" + day + "/" + year + " is a valid date.");
        } else {
            System.out.println(month + "/" + day + "/" + year + " is not a valid date. " + output);
        }
        
        keyboard.close();
    }
}