/**
 * @ClassName Solution67
 * @Description 剪绳子
 * @Author shishi
 * @Date 2020/1/24 13:06
 **/

/**
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class Solution67 {
    // 动态规划
    public int cutRope(int target) {
        int[] res = new int[target + 1];
        res[0] = 1;
        res[1] = 1;

        for (int i = 2; i <= target; i++) {
            // 因为题目说明m>1，所以最起码有2段，所以当i等于target的时候，它不能初始化成dp[i] = i;
            // 因为这样就是之分成了一段
            // 但是i!=target的话，就没有问题
            if (i != target)
                res[i] = i;

            // 接下来就是状态转移方程
            for (int j = 1; j < i; j++) {
                res[i] = Math.max(res[i], res[i - j] * j);
            }
        }

        return res[target];
    }


    // 第二遍练习
    public int cutRope2(int target) {
        int[] dp = new int[target + 1];
        dp[0] = 0;
        dp[1] = 1;
        if (target <= 1)
            return 0;

        for (int i = 2; i <= target; i++) {
            // 重点是下面这个if语句
            // 因为题目中要求最起码分成2段，所以只要i≠target，就可以独立成一段，而i==target时，不能独立成一段
            if (i != target)
                dp[i] = i;
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], j * dp[i - j]);
            }
        }
        return dp[target];
    }
}
