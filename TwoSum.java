/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = getTwoSumIndexes(nums, target);
        for (int r : result) {
            System.out.println(r);
        }
    }

    private static int[] getTwoSumIndexes(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i])) {
                return new int[]{indexMap.get(target - nums[i]), i};
            } else {
                indexMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
