package first_time; /**
 * @program: jianzhioffer
 * @description: 丑数
 * @author: shishi
 * @create: 2020-01-15 19:45
 **/

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class _____Solution33 {
    public int GetUglyNumber_Solution1(int index) {
        if (index < 0) return -1;
        int[] res = new int[index];
        res[0] = 1;

        int p1 = 0, p2 = 0, p3 = 0;
        for (int i = 1; i < index; i++) {
            res[i] = Math.min(res[p1] * 2, Math.min(res[p2] * 3, res[p3] * 5));

            if (res[i] == res[p1] * 2) p1++;
            if (res[i] == res[p2] * 3) p2++;
            if (res[i] == res[p3] * 5) p3++;
        }

        return res[index - 1];
    }

    public int GetUglyNumber_Solution(int index) {
        int cur = 0;
        int count = 0;
        while (count < index) {
            cur++;
            if (isUglyNum(cur))
                count++;
        }
        return cur;
    }

    private boolean isUglyNum(int cur) {
        if (cur == 1)
            return true;
        else {
            while (cur != 1) {
                if (cur % 2 == 0)
                    cur /= 2;
                else if (cur % 3 == 0)
                    cur /= 3;
                else if (cur % 5 == 0)
                    cur /= 5;
                else
                    return false;
            }
        }
        return true;
    }
}
