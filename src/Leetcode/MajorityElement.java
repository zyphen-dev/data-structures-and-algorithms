package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 * The input is generated such that a majority element will exist in the array.
 * <p>
 * <p>
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 */


class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        int[] nums = {3,2,3};
        System.out.println("The Majority Element for given array is = " + majorityElement(nums));
        System.out.println("The Majority Element for given array is = " + majorityElementUsingBoyerMooreAlgorithm(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static int majorityElementUsingBoyerMooreAlgorithm(int[] nums) {
        // Concept of Candidate and Count
        // Here candidate is array element and count its frequency in the array.
        // {2, 2, 1, 1, 1, 2, 2}
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (candidate == nums[i]) {
                count++;
            } else if (candidate != nums[i]) {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count++;
            }
        }
        return candidate;
    }
}
