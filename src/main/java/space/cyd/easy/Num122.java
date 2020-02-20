package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/02/19 20:18
 * @description: Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * <p>
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Example 2:
 * <p>
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 * engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class Num122 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int tmpSum = 0;
        int tmpLow = prices[0];
        int sum = 0;
        int prev = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prev) {
                sum += tmpSum;
                tmpSum = 0;
                tmpLow = prices[i];
            } else if (prices[i] > prev) {
                tmpSum = prices[i] - tmpLow;
            }
            prev = prices[i];
        }
        sum += tmpSum;
        return sum;
    }
}
