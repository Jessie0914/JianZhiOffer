package first_time; /**
 * @ClassName Solution50
 * @Description 数组中重复的数字
 * @Author shishi
 * @Date 2020/1/17 16:34
 **/

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2
 */
public class Solution50 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean[] status = new boolean[length];
        int i = 0;
        while (i < length) {
            if (status[numbers[i]]) {
                duplication[0] = numbers[i];
                return true;
            }
            status[numbers[i]] = true;
            i++;
        }
        System.out.println(duplication[0]);
        return false;
    }
}
