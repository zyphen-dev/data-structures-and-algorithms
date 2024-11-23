package recursion;

/**
 * printing natural numbers in reverse order using recursion.
 */
public class PrintReverseNaturalNumbers {
    public static void main(String[] args) {
        printReverseNaturalNumber(10, 1);
    }

    /**
     * Recursively prints natural numbers in reverse order from a starting point to an endpoint.
     *
     * @param from The starting number (inclusive).
     * @param to   The ending number (inclusive).
     */
    public static void printReverseNaturalNumber(int from, int to) {
        // Base condition: Stop recursion when the starting number is less than the ending number.
        if (from < to) {
            return;
        }
        System.out.println(from + " ");

        // Recursive call to print the next lower number.
        printReverseNaturalNumber(from - 1, to);
    }
}
