/**
 * @program: jianzhioffer
 * @description: 数组中只出现一次的数字
 * @author: shishi
 * @create: 2020-01-15 21:54
 **/

import java.util.Arrays;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * num1,num2分别为长度为1的数组。传出参数
 * 将num1[0],num2[0]设置为返回结果
 */
public class Solution40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Arrays.sort(array);
        int i = 0;
        int len = array.length;
        int count = 0;
        while (i < len && count < 2) {
            if ((i + 1) < len && array[i + 1] == array[i]) {
                i += 2;
            } else if ((i + 1) == len && count < 2) {
                num2[0] = array[i];
                return;
            } else if ((i + 1) < len && array[i + 1] != array[i]) {
                if (count == 0) {
                    num1[0] = array[i];
                    count++;
                } else if (count == 1) {
                    num2[0] = array[i];
                    return;
                }
                i++;
            }
        }
    }
}
