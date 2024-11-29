package recursion;

/**
 * A class that calculates the factorial of a given anumber using recursion.
 * The factorial of a non-negative integer n is the product of all positive
 * integers less than or equal to n.
 */
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The factorial of " + num + " is " + factorialOf(num));
    }

    /**
     * Calculates the factorial of a given number using recursion.
     * For example:
     * 5! = 5 * 4 * 3 * 2 * 1 = 120
     * 0! = 1 (by definition)
     *
     * @param target The non-negative integer to calculate factorial for
     * @return The factorial of the target number
     * @throws IllegalArgumentException if target is negative
     */
    public static int factorialOf(int target) {
        int result;

        // Check for negative input
        if (target < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        // Base cases
        if (target == 1 || target == 0) {
            return 1;
        }

        // Recursive case
        result = target * factorialOf(target - 1);

        return result;
    }
}
