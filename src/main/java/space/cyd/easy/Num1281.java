package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/1/13 0:02
 * @description: 1281
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 *
 * Example 1:
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 * Example 2:
 * Input: n = 4421
 * Output: 21
 * Explanation:
 * Product of digits = 4 * 4 * 2 * 1 = 32
 * Sum of digits = 4 + 4 + 2 + 1 = 11
 * Result = 32 - 11 = 21
 *
 * Constraints:
 * 1 <= n <= 10^5
 */
public class Num1281 {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int num = 0;
        while (n / 10 > 0) {
            num = n % 10;
            n = n / 10;
            product *= num;
            sum += num;
        }
        return product * n - sum - n;
    }

    public int bestAnswer(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        return product - sum;
    }
}
