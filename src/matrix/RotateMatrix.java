package matrix;

/**
 * Demonstrates how to rotate a square matrix by 90 degrees clockwise.
 *
 * <p>The rotation is done in-place using two steps:
 * <ul>
 *   <li>Transpose the matrix (swap rows and columns)</li>
 *   <li>Reverse each row</li>
 * </ul>
 *
 * <p>This approach avoids using extra space.
 */
public class RotateMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotateMatrix(matrix);
    }

    /**
     * Rotates the given square matrix by 90 degrees clockwise.
     *
     * <p>This method delegates the actual work to helper methods.
     *
     * @param matrix the square matrix to rotate
     */
    private static void rotateMatrix(int[][] matrix) {
        transposeMatrix(matrix);
    }

    /**
     * Transposes the matrix in-place.
     *
     * <p>Transposing means converting rows into columns.
     * After transposing, each row is reversed to complete
     * the clockwise rotation.
     *
     * @param matrix the square matrix to transpose
     */
    private static void transposeMatrix(int[][] matrix) {
        int temp;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = row + 1; column < matrix[row].length; column++) {
                temp = matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix[column][row] = temp;
            }
        }
        reverseRows(matrix);
        printMatrix(matrix);
    }

    /**
     * Reverses each row of the matrix in-place.
     *
     * <p>This step is required after transposition to achieve
     * a 90-degree clockwise rotation.
     *
     * @param matrix the matrix whose rows will be reversed
     */
    private static void reverseRows(int[][] matrix) {
        int temp;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length / 2; column++) {
                temp = matrix[row][column];
                matrix[row][column] = matrix[row][matrix[row].length - 1 - column];
                matrix[row][matrix[row].length - 1 - column] = temp;
            }
        }
    }

    /**
     * Prints the matrix to the console.
     *
     * <p>Each row is printed on a new line.
     *
     * @param matrix the matrix to print
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
