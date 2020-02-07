package second_time;

/**
 * @ClassName _31
 * @Description 整数中1出现的次数
 * @Author shishi
 * @Date 2020/2/4 21:08
 **/
public class _31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        // 暴力法
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                if (temp % 10 == 1)
                    cnt++;
                temp /= 10;
            }
        }

        return cnt;
    }
}
