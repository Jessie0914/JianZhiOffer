package second_time;

/**
 * @ClassName _52
 * @Description 正则表达式匹配
 * @Author shishi
 * @Date 2020/2/3 16:15
 **/
public class _52 {
    public boolean match(char[] str, char[] pattern) {
        return helper(str, 0, pattern, 0);
    }

    private boolean helper(char[] str, int i, char[] pattern, int j) {
        if (i == str.length && j == pattern.length)
            return true;
        if (i != str.length && j == pattern.length)
            return false;

        // 直接判断下一位是不是*
        if (j + 1 < pattern.length && pattern[j + 1] == '*') {
            // 如果当前元素相等或者为.，那么就有2种选择
            if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.'))
                return helper(str, i, pattern, j + 2) || helper(str, i + 1, pattern, j);
            else
                return helper(str, i, pattern, j + 2);
        } else {
            if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.'))
                return helper(str, i + 1, pattern, j + 1);
            else
                return false;
        }
    }
}
