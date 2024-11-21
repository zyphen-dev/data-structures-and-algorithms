package basicMath;

/**
 * Count the number(both -ive and +ive) of digits in the variable.
 */
public class CountDigits {
    public static void main(String[] args) {
        int num = 343242;
        int temp = num;
        int numberCount = 0;
        while (temp != 0) {
            numberCount++;
            temp = temp / 10;
        }
        System.out.println("The number " + num + " has " + numberCount + " digits in it.");
        System.out.println("The number " + num + " has " + countDigits(num) + " digits in it.");

    }

    /**
     * Logarithmic way of counting the digits.
     *
     * @param num number whose digits needs to be counted.
     * @return count of numbers.
     */
    public static int countDigits(int num) {
        return (int) (Math.log10(num) + 1);
    }
}
