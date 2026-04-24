/**
 * A program that demonstrates various array processing methods.
 * CITATION: The logic for array processing methods was guided by 
 * the Chapter 7 video archives, recaps and Java tutorials on YouTube.
 * @author David A. Rivera Ortiz
 * @version 1.2
 * @since 2026-04-19
 */
public class ArrayMethods {
  private int[] myArray;
    public ArrayMethods() {
        myArray = new int[]{ 12, 15, 23, 67, 85, 114, 256, 850 };
    }
    /**
     * Returns the number of elements in the array.
     */
    public int count() {
        return myArray.length;
    }

    /**
     * Calculates the total sum of all values in the array.
     */
    public int sum() {
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total;
    }
   /**
     * Calculates the average of all values in the array.
     */
    public double average() {
       
        return (double) sum() / count(); 
    }

    /**
     * Finds the highest value in the array.
     */
    public int findMax() {
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }
    /**
     * Finds the highest value in an integer array.
     * @param array The integer array to process.
     * @return The highest value found in the array.
     */
    public static int getHighest(int[] array) {
        int highest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i]; 
            }
        }
        return highest;
    }

    /**
     * Finds the lowest value in an integer array.
     * @param array The integer array to process.
     * @return The lowest value found in the array.
     */
    public int findIndexOfMax() {
        int maxIndex = 0;
        for (int i = 1; i < myArray.length; i++) {
            
            if (myArray[i] > myArray[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}