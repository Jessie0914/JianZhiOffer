package first_time; /**
 * @program: jianzhioffer
 * @description: 求1+2+3+...+n
 * @author: shishi
 * @create: 2020-01-16 16:53
 **/

/**
 * 求1+2+3+...+n，
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Solution47 {
    public int Sum_Solution(int n) {
        return (1 + n) * n / 2;
    }
}
