import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {5, 2, 9, 1, 8};

        // Print the original array
        System.out.println("Original Array:");
        printArray(numbers);

        // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("\nSorted Array:");
        printArray(numbers);
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line after printing all elements
    }
}
