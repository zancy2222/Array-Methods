import java.util.Arrays;

public class ArrayBinarySearchExample {
    public static void main(String[] args) {
        // Define a sorted array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Search for the element 5 in the array using Arrays.binarySearch()
        int index = Arrays.binarySearch(numbers, 3);

        // Check if the element was found and print the result
        if (index >= 0) {
            System.out.println("Element 3 found at index: " + index);
        } else {
            System.out.println("Element 3 not found in the array.");
        }
    }
}
 

// Index:  0  1  2  3  4
// Element: 1  2  3  4  5
