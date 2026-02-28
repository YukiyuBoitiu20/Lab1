import java.util.Scanner;

/**
 * 
 * This program reads three exam scores from the keyboard,
 * calculates the average, and displays the average and letter grade.
 * 
 * @author David A. Rivera Ortiz
 * 
 * 
 * @version 1.0
 * 
 * @since 2026-02-27
 * 
 */

public class TestScores {

    public static void main(String[] args) {
        // Input with Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Declarations of one type on a single line
        int exam1, exam2, exam3;
        double average;
        char letterGrade;
        
        // Get user input for each exam
        System.out.print("Enter Exam 1 score: ");
        exam1 = keyboard.nextInt();
        System.out.print("Enter Exam 2 score: ");
        exam2 = keyboard.nextInt();
        System.out.print("Enter Exam 3 score: ");
        exam3 = keyboard.nextInt();
        
        // Operations: Calculate average using 3.0 to ensure double division
        average = (exam1 + exam2 + exam3) / 3.0;
        
        // Multibranch if-else if to determine the letter grade
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        
        // Output: using printf to format average to one decimal place
        System.out.printf("With an avg score of %.1f\n", average);
        System.out.println("Your grade is: " + letterGrade);
        
        keyboard.close();
    }
}