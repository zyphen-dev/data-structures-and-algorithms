package recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int target = 100;
        System.out.println("Sum of first " + target + " natural numbers: " + sumOfNaturalNumber(target));
    }

    /**
     * Recursively calculates the sum of the first 'target' natural numbers.
     *
     * @param target The number up to which the sum is calculated (inclusive).
     * @return The sum of the first 'target' natural numbers.
     */
    public static int sumOfNaturalNumber(int target) {
        int result = 0;

        // Base condition: if target is 0, the sum is 0.
        if (target == 0) {
            return 0;
        }

        // Recursive call
        result = target + sumOfNaturalNumber(target - 1);
        return result;
    }
}
