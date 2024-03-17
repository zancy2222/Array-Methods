import java.util.Arrays;

public class ArrayToStringExample {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {5, 2, 9, 1, 8};

        // Convert the array to a string representation using Arrays.toString()
        String arrayAsString = Arrays.toString(numbers);

        // Print the string representation of the array
        System.out.println("Array as String: " + arrayAsString);
    }
}
