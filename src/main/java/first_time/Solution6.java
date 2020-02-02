package first_time; /**
 * @program: jianzhioffer
 * @description: 旋转数组的最小数字
 * @author: shishi
 * @create: 2020-01-14 14:34
 **/

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Solution6 {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if (len==0) return 0;

        // 根据旋转数组的特性，从前往后找，一旦找到第一个比前面数字小的，即为最小值
        int i=0;
        while (i<len-1){
            if (array[i]>array[i+1])
                return array[i+1];
            i++;
        }
        return array[i];
    }
}
