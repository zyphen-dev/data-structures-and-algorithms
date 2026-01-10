package matrix;

/**
 * Transpose of a matrix is simple Rows become columns and Columns become rows.
 * <p>
 * Demonstrates how to find and print the transpose of a matrix.
 * <p>
 * The program:
 * - Creates a 2D matrix
 * - Prints the original matrix
 * - Computes the transpose of the matrix
 * - Prints the transposed matrix
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        int[][] result = transposeMatrix(matrix, transposeMatrix);
        System.out.println("Transpose Matrix: ");
        printMatrix(result);
    }

    /**
     * Calculates the transpose of the given matrix.
     * <p>
     * Transpose means converting rows into columns.
     *
     * @param matrix          the original matrix
     * @param transposeMatrix an empty matrix used to store the transpose
     * @return the transposed matrix
     */
    private static int[][] transposeMatrix(int[][] matrix, int[][] transposeMatrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transposeMatrix[row][column] = matrix[column][row];
            }
        }
        return transposeMatrix;
    }

    /**
     * Prints the given matrix in row and column format.
     *
     * @param matrix the matrix to be printed
     */
    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
