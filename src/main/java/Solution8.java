/**
 * @program: jianzhioffer
 * @description: 跳台阶
 * @author: shishi
 * @create: 2020-01-14 14:58
 **/

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Solution8 {
    public int JumpFloor(int target) {
        if (target == 0) return 1;

        int[] nums = new int[target + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= target; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[target];
    }
}
