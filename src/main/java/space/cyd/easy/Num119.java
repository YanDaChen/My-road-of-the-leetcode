package space.cyd.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyda
 * @date: 2020/02/16 16:29
 * @description: Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * <p>
 * Note that the row index starts from 0.
 * <p>
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * <p>
 * Example:
 * <p>
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 * <p>
 * Could you optimize your algorithm to use only O(k) extra space?
 */
public class Num119 {
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 ) {
                    result.addFirst(1);
                } else if (j == i - 1){

                } else {
                    result.set(j, result.get(j) + result.get(j + 1));
                }
            }
        }
        return result;
    }
}
