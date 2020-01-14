package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/1/14 23:30
 * @description: The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence. You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 */
public class Num38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        char[] chars = countAndSay(n - 1).toCharArray();
        int pre = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[pre] != chars[i]) {
                sb.append(i - pre).append(chars[pre]);
                pre = i;
            }
        }
        sb.append(chars.length - pre).append(chars[pre]);
        return sb.toString();
    }
}
