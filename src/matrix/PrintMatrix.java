package matrix;

/**
 * This class demonstrates how to print a 2D matrix to the console.
 */
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(matrix);
    }

    /**
     * Prints the given 2D integer matrix in row and column format.
     * Each row is printed on a new line.
     *
     * @param matrix a 2D array of integers to be printed
     */
    static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
