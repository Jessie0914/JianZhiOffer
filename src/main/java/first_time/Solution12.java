package first_time; /**
 * @program: jianzhioffer
 * @description: 数值的整数次方
 * @author: shishi
 * @create: 2020-01-14 16:22
 **/

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 */
public class Solution12 {
    public double Power(double base, int exponent) {
        if (exponent == 0) return 1.0;

        // 要注意指数可能是负数
        boolean flag = true;
        if (exponent < 0) {
            flag = false;
            exponent = -exponent;
        }

        double res = 1.0;

        for (int i = 0; i < exponent; i++) {
            res *= base;
        }
        if (!flag)
            return 1 / res;

        return res;
    }
}
