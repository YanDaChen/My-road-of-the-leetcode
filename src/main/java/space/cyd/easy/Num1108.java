package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/1/12 23:42
 * @description: 1108
 */
public class Num1108 {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char i : address.toCharArray()) {
            if ('.' == i) {
                sb.append("[.]");
            } else {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
