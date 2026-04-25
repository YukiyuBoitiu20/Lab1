import java.util.Scanner;
import java.io.*;  

/**
 * Processes student grades from an input text file and writes the calculated statistics to an output file[cite: 31, 32, 33].
 * * @author David Rivera Ortiz
 * @version 1.0
 * @since 2026-03-11
 */
public class Grades { 
    
    // We have to 'throw' IOException here. It's basically telling Java, "Hey, dealing with files is risky, pass the buck if it fails"[cite: 43].
    public static void main (String[] args) throws IOException {  
        // Look how clean main is! We just call our custom methods to do the dirty work[cite: 34].
        String inFile = getInFile();
        String outFile = getOutFile();
        processFile(inFile, outFile);
    }

    /**
     * Uses Scanner to prompt the user for an input file name and verifies it exists[cite: 39, 41].
     * * @return name of the validated input file from Scanner[cite: 36].
     */
    public static String getInFile() {
        String inFileName;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the name of the input file (ie input.txt): ");
        inFileName = keyboard.nextLine();
        
        // We create a File object to see if the file actually exists on the computer[cite: 41].
        File file = new File(inFileName);
        
        // Welcome to the "while pit". If the file doesn't exist, we trap the user here until they give us a good one[cite: 42].
        while (!file.exists()) {
            System.out.println("Input file cannot be found.");
            System.out.print("Enter the name of the input file (ie input.txt): ");
            inFileName = keyboard.nextLine();
            file = new File(inFileName);
        }
        return inFileName;
    }
    
    /**
     * Uses Scanner to prompt the user for an output file name[cite: 48].
     * * @return name of the output file from Scanner[cite: 46].
     */
    public static String getOutFile() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of the output file (ie out.txt): ");
        return keyboard.nextLine(); 
    }
        
    /**
     * Reads scores from the input file, computes grade statistics per line, and writes them to the output file[cite: 55, 57].
     * * @param inFileName The name of the input file to read from[cite: 51].
     * @param outFileName The name of the output file to write the results to[cite: 51].
     */    
    public static void processFile(String inFileName, String outFileName) throws IOException {
        int number;
        int set = 1; // This tracks which line of grades we are on[cite: 64, 78, 80].

        // Setting up our file reader (Scanner) and our file writer (PrintWriter)[cite: 55, 60].
        File inFile = new File(inFileName);
        Scanner fileScanner = new Scanner(inFile);
        
        
        PrintWriter outStream = new PrintWriter(outFileName);

        // The outer loop: Keeps going as long as the file has more lines of text to read[cite: 55].
        while (fileScanner.hasNextLine()) {
            // We reset all our buckets back to zero at the start of every new line[cite: 55].
            int As = 0, Bs = 0, Cs = 0, Ds = 0, Fs = 0, count = 0, total = 0;
            double avg = 0.0;
            
            // Just a quick safety check to make sure the next thing in the file is actually a number.
            if (!fileScanner.hasNextInt()) {
                fileScanner.nextLine();
                
                continue;
                
            }
            
            // Grab the very first number in the line.
            number = fileScanner.nextInt();
            // Since it's the first number, it gets to be both the min and the max automatically.
            int min = number;
            
            int max = number;
            
            // The inner loop: Processes individual grades until we hit our sentinel value (-1)[cite: 55].
            while (number != -1) {
                // Update our min and max if we found a new extreme.
                if (number < min) min = number;
                
                if (number > max) max = number;
                
                // Keep a running tally of how many grades we've seen and what they add up to.
                count++;
                total += number;

                // Sort the grade into the right letter bucket[cite: 32].
                if (number >= 90) As++;
                else if (number >= 80) Bs++;
                
                else if (number >= 70) Cs++;
                
                else if (number >= 60) Ds++;
                else Fs++;

                // Grab the next grade in the line before the loop restarts[cite: 55].
                number = fileScanner.nextInt();
            }
            
            // Time to write our findings to the new file!
            outStream.println("Set " + set + " of grades calculated");
            
            // If count is 0, it means the line was empty (or just had a -1), so we can't do any math[cite: 56, 79].
            if (count == 0) {
                outStream.println("No grades to average");
            } else {
                // Print out the breakdown for the current line [cite: 65-74].
                outStream.println("Number of As: " + As);
                
                outStream.println("Number of Bs: " + Bs);
                
                outStream.println("Number of Cs: " + Cs);
                
                outStream.println("Number of Ds: " + Ds);
                
                outStream.println("Number of Fs: " + Fs);
                
                outStream.println("The high score was: " + max);
                
                outStream.println("The low score was: " + min);
                
                // CRITICAL: We have to cast to (double) before dividing, otherwise Java chops off the decimal! [cite: 58]
                avg = (double) total / count;
                
                outStream.printf("The avg score is: %.1f\n", avg);
            }
            
            // Move on to the next line number.
            set++;
        }
        
        // Print a success message to the console so the user knows it worked[cite: 61, 62].
        System.out.println("Grade processing completed");
        System.out.println("You can retrieve the output file at, " + outFileName);
        
        // Always close your streams so the file actually saves properly!
        fileScanner.close();
        outStream.close();
    }
}