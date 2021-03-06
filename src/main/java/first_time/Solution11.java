package first_time; /**
 * @program: jianzhioffer
 * @description: 二进制中1的个数
 * @author: shishi
 * @create: 2020-01-14 16:04
 **/

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class Solution11 {
    public int NumberOf1(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1') count++;
        }
        return count;
    }
}
