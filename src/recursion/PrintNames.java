package recursion;

public class PrintNames {
    public static void main(String[] args) {
        printName(1, 10);
    }

    /**
     * Recursively prints a sequence of numbers followed by " - Java".
     * The method will print all integers from 'from' to 'to' inclusive,
     * each followed by " - Java" on a new line.
     *
     * @param from from The starting number (inclusive)
     * @param to   to The ending number (inclusive)
     */
    public static void printName(int from, int to) {
        //Base case: stop recursion when we've printed all numbers up to 'to'
        if (from > to) {
            return;
        }
        System.out.println(from + " - Java");

        //Recursive case: call the method again with the next number
        printName(from + 1, to);
    }
}
