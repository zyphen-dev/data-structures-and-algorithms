package recursion;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        printNaturalNumber(1, 10);
    }

    /**
     * Recursively prints natural numbers from 'from' to 'to' in ascending order.
     * Numbers are printed on the same line with a space between them.
     *
     * @param from from The starting number (inclusive)
     * @param to   The ending number (inclusive)
     */
    public static void printNaturalNumber(int from, int to) {
        // Base case: stop recursion when we've printed all numbers up to 'to'
        if (from > to) {
            return;
        }
        System.out.print(from + " ");
        // Recursive case: call the method again with the next number
        printNaturalNumber(from + 1, to);
    }
}
