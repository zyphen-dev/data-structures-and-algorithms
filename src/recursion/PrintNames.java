package recursion;

public class PrintNames {
    public static void main(String[] args) {
        printName(1, 10);
        printName2(10, "Shivam");
        printName3(10, "Beohar");
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

    /**
     * Recursively prints the given name along with a decreasing counter.
     * <p>
     * This method uses a recursive approach where the recursive call
     * happens before the print statement. Because of this, the method
     * builds up the call stack before printing.
     * <p>
     * This is **not tail recursive**, because the last operation in the function is not the recursive call —
     * the method still needs to do something (i.e., print) **after** the recursion returns.
     *
     * @param times The number of times to print the name.
     * @param name  The name to be printed along with the counter.
     */
    public static void printName2(int times, String name) {
        if (times == 0) return;

        printName2(times - 1, name);
        System.out.println(times + " " + name);
    }

    /**
     * Recursively prints the given name along with a decreasing counter.
     * <p>
     * This method prints first and then makes the recursive call.
     * <p>
     * This **is tail recursive**, because the recursive call is the **last operation** in the function.
     * There's nothing left to do in this function after the recursive call returns,
     * so in theory, the compiler or JVM could optimize it (though Java does not do this by default).
     *
     * @param times The number of times to print the name.
     * @param name  The name to be printed along with the counter.
     */
    public static void printName3(int times, String name) {
        if (times == 0) return;

        System.out.println(times + " " + name);
        printName3(times - 1, name);
    }
}
