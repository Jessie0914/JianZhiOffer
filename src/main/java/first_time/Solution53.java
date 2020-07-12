package first_time; /**
 * @ClassName Solution53
 * @Description 表示数值的字符串
 * @Author shishi
 * @Date 2020/1/18 15:56
 **/

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class Solution53 {
    public boolean isNumeric(char[] str) {
        int len = str.length;
        if (len == 0)
            return false;
        if (len == 1)
            return Character.isDigit(str[0]);

        int i = 0;
        if (str[0] == '-') {
            i++;
        } else if (str[0] == '+') {
            i++;
        }

        while (i < len && Character.isDigit(str[i])) {
            i++;
        }

        if (i == len)
            return true;

        if (str[i] == '.') {
            i++;
            if (i == len)
                return false;

            while (i < len && Character.isDigit(str[i])) {
                i++;
            }
            if (i == len)
                return true;
            else if (str[i] == 'e' || str[i] == 'E')
                return judgeAfterE(str, i + 1);
            else
                return false;
        } else if (str[i] == 'e' || str[i] == 'E')
            return judgeAfterE(str, i + 1);
        else
            return false;

    }

    // 保证E后面的都是整数就行
    private boolean judgeAfterE(char[] str, int i) {
        int len = str.length;
        if (i == len)
            return false;

        if (str[i] == '-' || str[i] == '+')
            i++;

        if (i == len)
            return false;
        // 判断后面的是整数即可，必须每一位都是数字
        while (i < len && Character.isDigit(str[i])) {
            i++;
        }
        if (i == len)
            return true;
        else
            return false;
    }
}
