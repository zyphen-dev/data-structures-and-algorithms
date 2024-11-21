package basicMath;

/**
 * Check if a number is Palindrome or Not
 */

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int num = 1223221;
        System.out.println(isNumberPalindrome(num));
    }

    /**
     * This approach reverse the integer and match with original one. If same, number is palindrome otherwise not.
     *
     * @param num number to check if it's a palindrome or not.
     * @return reverse of the @param num number.
     */
    public static boolean isNumberPalindrome(int num) {
        int originalNum = num;
        int rev = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        boolean result = rev == originalNum;
        if (result) {
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }
        return result;
    }
}

