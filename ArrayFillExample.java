import java.util.Arrays;

public class ArrayFillExample {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = new int[5];

        // Fill the array with a specific value (e.g., 10) using Arrays.fill()
        Arrays.fill(numbers, 10);

        // Print the filled array
        System.out.println("Filled Array:");
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
