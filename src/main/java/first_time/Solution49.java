package first_time; /**
 * @program: jianzhioffer
 * @description: 把字符串转换成整数
 * @author: shishi
 * @create: 2020-01-16 17:49
 **/

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * +2147483647 ------ 2147483647
 * 1a33 ------ 0
 */
public class Solution49 {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;

        str = str.trim();
        int len = str.length();
        if (len == 0)
            return 0;

        char[] chars = str.toCharArray();
        int i = 0;
        // 判断是不是负数
        boolean flag = true;
        if (chars[0] == '-') {
            flag = false;
            i++;
        } else if (chars[0] == '+') {
            i++;
        }

        int res = 0;
        while (i < len) {
            if (!Character.isDigit(chars[i]))
                return 0;
            else {
                int num = chars[i] - '0';
                // 先判断溢出
                // 正溢出和负溢出是不一样的，要分开判断

                // 正溢出
                if (flag && (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10)))
                    return 0;

                    // 负溢出
                else if (!flag && (-res < Integer.MIN_VALUE / 10 || (-res == Integer.MIN_VALUE / 10 && -num < Integer.MIN_VALUE % 10)))
                    return 0;

                // 都不溢出，那么继续
                res = res * 10 + (chars[i] - '0');
                i++;
            }
        }

        return flag ? res : -res;
    }
}
