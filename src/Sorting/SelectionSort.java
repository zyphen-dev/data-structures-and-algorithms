package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 1};
        doSelectionSortOn(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void doSelectionSortOn(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;

            // Find the minimum element using index.
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element to its correct position.
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
