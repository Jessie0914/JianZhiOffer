/**
 * @program: jianzhioffer
 * @description:
 * @author: shishi
 * @create: 2020-01-14 14:45
 **/

/**
 * 大家都知道斐波那契数列
 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Solution7 {
    public int Fibonacci(int n) {
        if (n==0) return 0;
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i=2;i<=n;i++){
            nums[i] = nums[i-2] + nums[i-1];
        }

        return nums[n];
    }
}
