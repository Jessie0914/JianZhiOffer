package first_time; /**
 * @program: jianzhioffer
 * @description: 把数组排成最小的数
 * @author: shishi
 * @create: 2020-01-15 19:11
 **/

import java.util.Arrays;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class ___Solution32 {
    public String PrintMinNumber(int[] numbers) {
        String[] strs = new String[numbers.length];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        // 关键是这个排序函数
        // 我的方法是逐个比较字符，阴差阳错也是对的
        // 网上更容易理解的方法是：比较s1+s2和s2+s1的大小，哪个小，就让谁排在前面
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len = o1.length() <= o2.length() ? o1.length() : o2.length();
                int i = 0;
                while (i < len) {
                    if (o1.charAt(i) < o2.charAt(i)) {
                        return -1;
                    } else if (o1.charAt(i) > o2.charAt(i)) {
                        return 1;
                    } else {
                        i++;
                    }
                }
                return -1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }
}
