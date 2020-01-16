/**
 * @program: jianzhioffer
 * @description: 不用加减乘除做加法
 * @author: shishi
 * @create: 2020-01-16 16:55
 **/

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class _____Solution48 {
    // https://www.nowcoder.com/questionTerminal/59ac416b4b944300b617d4f7f111b215?f=discussion
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int sum = num1 ^ num2;
            int carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
