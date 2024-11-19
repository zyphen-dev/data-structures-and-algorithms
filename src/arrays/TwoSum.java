package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] nonOptimalResult = twoSumNotOptimalSolution(nums, target);
        System.out.println(Arrays.toString(nonOptimalResult));

        int[] optimalResult = twoSumOptimalSolution(nums, target);
        System.out.println(Arrays.toString(optimalResult));
    }

    private static int[] twoSumOptimalSolution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //Start looping whole array.
        for (int i = 0; i < nums.length; i++) {

            //store the first element
            int curr = nums[i];

            //use (b = target - a) equation.
            int num2 = target - curr;

            // Imp: if map contains
            if (map.containsKey(num2)) {
                return new int[]{map.get(num2), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static int[] twoSumNotOptimalSolution(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}


/**
 * a + b == target;
 * we know a and target number, and we need to find b so the equation becomes
 * b = target - a;
 * Using the Hashmap you are storing a to find the b such that a + b = target.
 * <p>
 * Learning:
 * 1. Use a HashMap for Fast Lookup: Store numbers you've seen so far along with their indices.
 */