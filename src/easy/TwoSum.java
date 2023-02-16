package easy;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            int first = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int second = target - first;
                if (nums[j] == second) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9))); //output [0,1]/ [1,0]

        int[] arr1 = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr1, 6))); //output [2,1]/ [1,2]
    }
}
