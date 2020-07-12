package first_time; /**
 * @ClassName __________Solution52
 * @Description 正则表达式匹配
 * @Author shishi
 * @Date 2020/1/18 14:12
 **/

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class __________Solution52 {
    public boolean match(char[] str, char[] pattern) {
        return recursion_match(str, 0, pattern, 0);
    }

    private boolean recursion_match(char[] str, int i, char[] pattern, int j) {
        // 先判断边界
        if (i == str.length && j == pattern.length)
            return true;
        if (i != str.length && j == pattern.length)
            return false;

        // 判断pattern的下一位是不是*
        if (j + 1 < pattern.length && pattern[j + 1] == '*') {
            if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.')) {
                // 匹配0个字符、或者当做是1个字符往后继续匹配
                return recursion_match(str, i, pattern, j + 2) || recursion_match(str, i + 1, pattern, j);
            } else {
                return recursion_match(str, i, pattern, j + 2);
            }
        } else {
            if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.')) {
                return recursion_match(str, i + 1, pattern, j + 1);
            } else {
                return false;
            }
        }

    }
}
