/**
 * @program: jianzhioffer
 * @description: 变态跳台阶
 * @author: shishi
 * @create: 2020-01-14 15:19
 **/

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution9 {
    public int JumpFloorII(int target) {
        int[] nums = new int[target + 1];
        nums[0] = 1;
        nums[1] = 1;

        for (int i=2;i<=target;i++){
            for (int p=0;p<i;p++){
                nums[i] += nums[p];
            }
        }
        return nums[target];
    }
}
