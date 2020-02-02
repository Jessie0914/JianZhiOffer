package review;

/**
 * @ClassName _67
 * @Description 剪绳子
 * @Author shishi
 * @Date 2020/2/2 23:05
 **/
public class _67 {
    public int cutRope(int target) {
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
