package recursion;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Notice how we can now just call reverseArray with just the array
        reverseArray(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    /**
     * Convenience method that takes only the array as parameter.
     * This makes the method easier to use as callers don't need to worry
     * about providing the correct start and end indices.
     *
     * @param arr The array to be reversed
     */
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        swapArrayElements(0, arr.length - 1, arr);
    }

    /**
     * Internal helper method that does the actual recursive reversal
     */
    private static void swapArrayElements(int firstElementIndex, int lastElementIndex, int[] arr) {
        if (firstElementIndex >= lastElementIndex) {
            return;
        }
        int temp = arr[firstElementIndex];
        arr[firstElementIndex] = arr[lastElementIndex];
        arr[lastElementIndex] = temp;
        swapArrayElements(firstElementIndex + 1, lastElementIndex - 1, arr);
    }
}