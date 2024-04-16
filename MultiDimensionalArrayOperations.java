import java.util.Arrays;

public class MultiDimensionalArrayOperations {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Searching
        int searchElement = 5;
        boolean found = searchElement(matrix, searchElement);
        System.out.println("Is " + searchElement + " present in the matrix? " + found);

        // Sorting
        sortMatrix(matrix);
        System.out.println("Sorted Matrix:");
        printMatrix(matrix);

        // Merging
        int[][] anotherMatrix = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        };
        int[][] mergedMatrix = mergeMatrices(matrix, anotherMatrix);
        System.out.println("Merged Matrix:");
        printMatrix(mergedMatrix);

        // Splitting
        int[][][] splitMatrices = splitMatrix(mergedMatrix, 3);
        System.out.println("Split Matrix 1:");
        printMatrix(splitMatrices[0]);
        System.out.println("Split Matrix 2:");
        printMatrix(splitMatrices[1]);

        // Traversal
        System.out.println("Matrix Traversal:");
        traverseMatrix(matrix);

        // Filtering
        int[][] filteredMatrix = filterMatrix(matrix, 5);
        System.out.println("Filtered Matrix:");
        printMatrix(filteredMatrix);
    }

    // Searching
    public static boolean searchElement(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // Sorting
    public static void sortMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            Arrays.sort(row);
        }
    }

    // Merging
    public static int[][] mergeMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] mergedMatrix = new int[matrix1.length + matrix2.length][];
        System.arraycopy(matrix1, 0, mergedMatrix, 0, matrix1.length);
        System.arraycopy(matrix2, 0, mergedMatrix, matrix1.length, matrix2.length);
        return mergedMatrix;
    }

    // Splitting
    public static int[][][] splitMatrix(int[][] matrix, int splitIndex) {
        int[][][] splitMatrices = new int[2][][];
        splitMatrices[0] = Arrays.copyOfRange(matrix, 0, splitIndex);
        splitMatrices[1] = Arrays.copyOfRange(matrix, splitIndex, matrix.length);
        return splitMatrices;
    }

    // Traversal
    public static void traverseMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Filtering
    public static int[][] filterMatrix(int[][] matrix, int filterValue) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] filteredMatrix = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] == filterValue) {
                    filteredMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return filteredMatrix;
    }

    // Utility method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
