package basicMath;

public class DivisorOfNumber {
    public static void main(String[] args) {
        int numberToFindDivisorOf = 36;
        printDivisors1(numberToFindDivisorOf);
        System.out.println();
        printDivisors2(numberToFindDivisorOf);
    }

    /**
     * This is brute force approach
     *
     * @param numberToFindDivisorOf the number whose divisor we have to find.
     */
    public static void printDivisors1(int numberToFindDivisorOf) {
        for (int i = 1; i <= numberToFindDivisorOf; i++) {
            if (numberToFindDivisorOf % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * This is an optimized approach.
     *
     * @param numberToFindDivisorsOf the number whose divisor we have to find.
     */
    public static void printDivisors2(int numberToFindDivisorsOf) {
        for (int i = 1; (i * i) <= numberToFindDivisorsOf; i++) {

            if (numberToFindDivisorsOf % i == 0) {
                System.out.print(i + " ");

                if (numberToFindDivisorsOf / i != i) {
                    System.out.print(numberToFindDivisorsOf / i + " ");
                }
            }
        }
    }
}

/**
 * Let's say target number is 36
 * 1 * 36 = 36
 * 2 * 18 = 36
 * 3 * 12 = 36
 * 4 * 9 = 36
 * 6 * 6 = 36
 * <p>
 * In optimal approach, first 'if' gets the left side numbers and second 'if' gets the right side numbers
 * second check make sure that 6 should only be printed once.
 */
