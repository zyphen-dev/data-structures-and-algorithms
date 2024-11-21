package basicMath;

/**
 * Reverse an Integer.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int num = 123456;
        int temp = num;
        int result = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            result = result * 10 + lastDigit;
            temp = temp / 10;
        }
        System.out.println("The reverse of " + num + " is " + result);
    }
}
