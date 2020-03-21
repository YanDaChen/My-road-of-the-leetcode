package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/03/04 22:37
 * @description: Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class Num189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int temp;
        while (k >= length) {
            k = k - length;
        }
        int checkK = k > length / 2 ? (length - k) : k;
        for (int i = 0; i < checkK; i++) {
            int point = i;
            do {
                point = point + k;
                if (point >= length) {
                    point -= length;
                }
                temp = nums[point];
                nums[point] = nums[i];
                nums[i] = temp;
            } while (point != i);
            if (length % checkK != 0 || checkK == 1) return;
        }
    }
}
