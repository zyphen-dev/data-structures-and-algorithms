package basicMath;

/**
 * Count the number(both -ive and +ive) of digits in the variable.
 */
public class CountDigits {
    public static void main(String[] args) {
        int num = 343242;
        int temp = num;
        int count = 0;
        while(temp > 0) {
            count++;
            temp = temp/10;
        }
        System.out.println(countDigits(num));
        System.out.println("use of / = " + num/10);
        System.out.println("use of % = " + num%10);
        System.out.println("Number of digits are "+count);
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
