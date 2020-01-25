package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/01/25 15:15
 * @description: Num53
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class Num53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev <= 0) {
                prev = nums[i];
            } else {
                prev += nums[i];
            }
            max = Math.max(max, prev);
        }
        return max;
    }
}
