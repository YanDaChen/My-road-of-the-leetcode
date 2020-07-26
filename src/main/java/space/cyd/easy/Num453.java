package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/06/28 21:46
 * @description:
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
 *
 * Example:
 *
 * Input:
 * [1,2,3]
 *
 * Output:
 * 3
 *
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 *
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
public class Num453 {
    public int minMoves(int[] nums) {
        if (nums.length == 1) return 0;
        long max = Integer.MIN_VALUE;
        for (int num : nums) {
            if(num > max){
                max = num;
            }
        }
        long sum = 0;
        long originSum = 0;
        for (int num : nums) {
            sum += (max - num);
            originSum += num;
        }
        long x = max;
        while(((x - max)* nums.length + sum )% (nums.length -1) !=0 || (nums.length * x != originSum +(x - max) * nums.length + sum) ){
            x++;
        }
        return (int)(((x - max) * nums.length + sum) /(nums.length - 1));
    }

    public static void main(String[] args) {
        int i = new Num453().minMoves(new int[]{-100,0,100});
        System.out.println(i);
    }
}
