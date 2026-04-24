import java.util.Arrays;
/**
 * A program that demonstrates various array processing methods.
 * CITATION: The logic for array processing methods was guided by 
 * the Chapter 7 video archives, recaps and Java tutorials on YouTube.
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-04-24
 */
public class ArrayMethods {
  private int[] myArray;
    public ArrayMethods() {
        myArray = new int[] { 7, 8, 8, 3, 4, 9, 8, 7 };
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
    /**
     * Prints an array in a comma-separated format with curly braces.
     * @param a The integer array to be printed.
     */
    public void print(int[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    /**
     * Searches backwards to find the last index where the key appears.
     * @param key The integer value to search for.
     * @return The integer index of the last occurrence, or -1 if not found.
     */
    public int findLast(int key) {
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (myArray[i] == key) {
                return i;
            }
        }
        return -1; 
    }

    /**
     * Finds all indices where the key appears and returns them in a new array.
     * @param key The integer value to search for.
     * @return An integer array containing all index positions where the key was found.
     */
    public int[] findAll(int key) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                count++;
            }
        }
        
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                indices[index] = i;
                index++;
            }
        }
        return indices;
    }

    /**
     * Returns the array.
     * @return The integer array stored in this object.
     */
    public int[] getArray() {
        return myArray;
    }

    /**
     * Uses Arrays.copyOf() to create and return an exact copy of the array.
     * @return A new integer array that is an exact copy.
     */
    public int[] copyArray() {
        return Arrays.copyOf(myArray, myArray.length);
    }

    /**
     * Creates a new array with the elements in reverse order.
     * @param inArray The array to be reversed.
     * @return A new integer array containing the reversed elements.
     */
    public int[] reverseArray(int[] inArray) {
        int[] newArray = new int[inArray.length];
        int newIndex = 0;
        
        for (int i = inArray.length - 1; i >= 0; i--) {
            newArray[newIndex] = inArray[i]; 
            newIndex++;
        }
        return newArray;
    }
}