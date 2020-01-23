import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Solution64
 * @Description 滑动窗口的最大值
 * @Author shishi
 * @Date 2020/1/22 20:00
 **/

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class Solution64 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = num.length;

        if (len == 0 || size<=0 || size>len)
            return list;


        if (size == len) {
            Arrays.sort(num);
            list.add(num[len-1]);
            return list;
        }

        for (int i = 0; i < len - size + 1; i++) {
            int max = num[i];
            for (int j = i + 1; j < size + i; j++) {
                if (num[j]>max)
                    max = num[j];
            }
            list.add(max);
        }
        return list;
    }
}
