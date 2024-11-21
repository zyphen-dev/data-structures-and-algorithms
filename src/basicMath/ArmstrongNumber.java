package basicMath;

/**
 * Determine whether a number is an Armstrong number.
 * <p>
 * An Armstrong number (also known as narcissistic number) is a number
 * that is the sum of its own digits each raised to the power of the number of digits.
 * <p>
 * For example:
 * - 153 is an Armstrong number because 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
 * - 370 is an Armstrong number because 3³ + 7³ + 0³ = 27 + 343 + 0 = 370
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int numberToCheck = 153;
        if (numberToCheck == calculateSumOfPoweredDigits(numberToCheck)) {
            System.out.println(numberToCheck + " is an Armstrong Number");
        } else {
            System.out.println(numberToCheck + " is not an Armstrong Number");
        }
    }

    /**
     * Calculates the sum of each digit raised to the power of total number of digits.
     * <p>
     * This method breaks down the number into individual digits,
     * raises each digit to the power of total digit count,
     * and then sums these powered digits.
     *
     * @param originalNumber The number to be checked for Armstrong property
     * @return The sum of each digit raised to the power of total digit count
     */
    public static int calculateSumOfPoweredDigits(int originalNumber) {
        int sumOfPoweredDigits = 0;
        int totalDigits = countTotalDigits(originalNumber);
        int currentNumber = originalNumber;

        while (currentNumber != 0) {
            int currentDigit = currentNumber % 10;
            sumOfPoweredDigits = sumOfPoweredDigits + calculateDigitPower(currentDigit, totalDigits);
            currentNumber = currentNumber / 10;
        }
        return sumOfPoweredDigits;
    }

    /**
     * Calculates a single digit raised to the power of the total number of digits.
     * <p>
     * This method performs exponentiation by using a multiplication loop,
     * which is an alternative to using Math.pow() method.
     *
     * @param digit       The individual digit to be powered
     * @param totalDigits The number of digits in the original number
     * @return The digit raised to the power of total digits
     */
    public static int calculateDigitPower(int digit, int totalDigits) {
        int powerResult = 1;
        for (int exponent = 0; exponent < totalDigits; exponent++) {
            powerResult = digit * powerResult;
        }
        System.out.println("The " + digit + " raised to the power of " + totalDigits + " is equals to " + powerResult);
        return powerResult;
    }

    /**
     * Counts the total number of digits in a given number.
     * <p>
     * This method determines the number of digits by repeatedly
     * dividing the number by 10 until it becomes zero.
     *
     * @param number The number whose digits are to be counted
     * @return The total count of digits in the number
     */
    public static int countTotalDigits(int number) {
        int digitCount = 0;
        int currentNumber = number;
        while (currentNumber != 0) {
            digitCount++;
            currentNumber = currentNumber / 10;
        }
        System.out.println("The total number of digits are " + digitCount);
        return digitCount;
    }
}
