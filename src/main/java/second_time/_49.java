package second_time;

/**
 * @ClassName _49
 * @Description 将字符串转换成整数
 * @Author shishi
 * @Date 2020/2/4 16:44
 **/
public class _49 {
    public int StrToInt(String str) {
        int len = str.length();
        if (str == "" || len == 0)
            return 0;
        int index = 0;
        int result = 0;

        while (index < len && str.charAt(index) == ' ')
            index++;

        boolean flag = true;
        if (str.charAt(index) == '+') {
            index++;
        } else if (str.charAt(index) == '-') {
            flag = false;
            index++;
        }

        while (index < len) {
            if (!Character.isDigit(str.charAt(index)))
                return 0;
            else {
                int num = str.charAt(index) - '0';
                // 判断有没有越界
                if (flag) {
                    if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10))
                        return 0;
                    else
                        result = result * 10 + num;
                } else {
                    if (-result < Integer.MIN_VALUE / 10 || (-result == Integer.MIN_VALUE / 10 && -num < Integer.MIN_VALUE % 10))
                        return 0;
                    else
                        result = result * 10 + num;
                }
                index++;
            }
        }

        return flag ? result : -result;
    }
}
