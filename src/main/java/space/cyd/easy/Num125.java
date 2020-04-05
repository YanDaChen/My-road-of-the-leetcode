package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/02/20 15:47
 * @description: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 */
public class Num125 {
    public boolean isPalindrome(String s) {
        if (s == null || "".equals(s)) return true;
        char[] chars = s.toCharArray();
        int length = chars.length;
        int start = 0;
        int end = chars.length - 1;
        do {
            while ((start <= chars.length - 1) && !charcheck(chars[start])) {
                start++;
            }
            while (end >= 0 && !charcheck(chars[end])) {
                end--;
            }
            if (start == length) return true;
            if (low(chars[start]) != low(chars[end])) {
                return false;
            }
            start++;
            end--;
        } while (start < end);
        return true;
    }

    private boolean charcheck(char c) {
        //a-z：97-122，A-Z：65-90，0-9：48-57
        if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c >= 48 && c <= 57)) {
            return true;
        } else {
            return false;
        }
    }
    private char low(char c){
        if(c >= 97 && c <= 122){
            return (char)(c - 32);
        }else{
            return c;
        }
    }
}
