package first_time; /**
 * @program: jianzhioffer
 * @description: 数组中出现次数超过一半的数字
 * @author: shishi
 * @create: 2020-01-15 17:56
 **/

import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);

        int len = array.length;
        if (len==1) return array[0];

        int count = 0;
        int i=0;
        while (i<len){
            if (i==0) count=1;
            else {
                if (array[i]==array[i-1]) {
                    count++;
                    if (count>len/2)
                        return array[i];
                }else {
                    count = 1;
                }
            }
            i++;
        }
        return 0;
    }
}
