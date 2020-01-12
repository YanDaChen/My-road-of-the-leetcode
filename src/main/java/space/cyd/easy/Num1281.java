package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/1/13 0:02
 * @description: 1281
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
