package space.cyd.easy;

import java.util.HashSet;

/**
 * @author: chenyda
 * @date: 2020/2/24 21:30
 * @description:
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class Num136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> store = new HashSet<>(nums.length);
        for (int num : nums) {
            if(store.contains(num)){
                store.remove(num);
            }else{
                store.add(num);
            }
        }
        return store.iterator().next();
    }
}
