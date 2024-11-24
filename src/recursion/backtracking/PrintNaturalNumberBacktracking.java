package recursion.backtracking;

/**
 * A class to demonstrate printing natural numbers in ascending order using recursion and backtracking.
 */
public class PrintNaturalNumberBacktracking {
    public static void main(String[] args) {
        printNaturalNumberUsingBacktracking(10, 1);
    }

    /**
     * Recursively prints natural numbers from 'to' to 'from' in ascending order using backtracking.
     * <p>
     * Backtracking is achieved by deferring the action (printing) until the recursion has
     * completed traversing to the smallest number (base case). This ensures the numbers
     * are printed in ascending order while recursion backtracks.
     *
     * @param from The starting number (inclusive).
     * @param to   The ending number (inclusive).
     */
    public static void printNaturalNumberUsingBacktracking(int from, int to) {
        // Base case: stop recursion when the starting number becomes smaller than the ending number.
        if (from < to) {
            return;
        }

        // Recursive call to descend to the next smaller number.
        printNaturalNumberUsingBacktracking(from - 1, to);

        // Action deferred until recursion backtracks, ensuring ascending order.
        System.out.print(from + " ");
    }
}
