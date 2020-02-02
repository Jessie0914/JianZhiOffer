package first_time; /**
 * @program: jianzhioffer
 * @description: 调整数组顺序使奇数位于偶数前面
 * @author: shishi
 * @create: 2020-01-14 16:46
 **/

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution13 {
    public void reOrderArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i]%2==1)
                i++;
            // 如果是偶数
            else {
                // 往后找第一个奇数
                int j=i+1;
                while (j<array.length){
                    if (array[j]%2==0)
                        j++;
                    // 找到了第一个奇数
                    else {
                        int temp = array[j];
                        // 把i到j的偶数都向后移
                        int p=j;
                        while (p>i){
                            array[p] = array[p-1];
                            p--;
                        }
                        array[i] = temp;
                        break;
                    }
                }
                i++;
            }
        }
    }
}
