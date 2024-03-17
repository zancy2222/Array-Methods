import java.util.Arrays;

public class ArrayCopyOfExample {
    public static void main(String[] args) {
        // Define an array of integers
        int[] originalArray = {1, 2, 3, 4, 5};

        // Create a copy of the original array using Arrays.copyOf()
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

        // Modify the copied array
        copiedArray[0] = 10; // Change the first element of the copied array

        // Print the original and copied arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
