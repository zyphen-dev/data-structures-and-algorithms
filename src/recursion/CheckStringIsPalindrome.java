package recursion;

public class CheckStringIsPalindrome {
    public static void main(String[] args) {
        String target = "aaaa";
        System.out.println(checkIfStringIsPalindrome(removeSpecialCharacters(target)));
    }

    /**
     * Public wrapper method to initiate palindrome check.
     *
     * @param target The string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean checkIfStringIsPalindrome(String target) {
        return checkPalindrome(0, target);
    }

    /**
     * Recursive method to check if a string is a palindrome.
     * Compares characters from start and end, moving inward.
     *
     * @param index  Current index being checked from the start
     * @param target The string being checked
     * @return true if the substring from current index is a palindrome, false otherwise
     */
    public static boolean checkPalindrome(int index, String target) {
        if (target != null && !target.isEmpty()) {
            System.out.print("Comparing elements " + target.charAt(index) + " and " + target.charAt(target.length() - 1 - index) + " at index " + index + " and " + (target.length() - 1 - index) + " respectively");
            System.out.println();

            // Base case: when we've reached or crossed the middle of the string
            if (index >= (target.length() - 1 - index)) {
                return true;
            }

            // If characters don't match, it's not a palindrome
            if (target.charAt(index) != target.charAt(target.length() - 1 - index)) {
                System.out.println(target.charAt(index) + " is not equal to " + target.charAt(target.length() - 1 - index));
                return false;
            }

            // Recursive case: check next pair of characters
            return checkPalindrome(index + 1, target);
        }
        return true; // Empty or null strings are considered palindromes
    }

    /**
     * Removes special characters from the string and converts to lowercase.
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     *
     * @param target The string to clean
     * @return The cleaned string with only alphanumeric characters in lowercase
     */
    public static String removeSpecialCharacters(String target) {
        return target.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
