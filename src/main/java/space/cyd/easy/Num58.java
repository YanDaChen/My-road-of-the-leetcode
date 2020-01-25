package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/01/25 15:28
 * @description: Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a maximal substring consisting of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 */
public class Num58 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                count++;
            } else if (count > 0) {
                return count;
            }
        }
        return count;
    }
}
