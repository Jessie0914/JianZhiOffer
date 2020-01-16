/**
 * @program: jianzhioffer
 * @description: 矩形覆盖
 * @author: shishi
 * @create: 2020-01-14 15:26
 **/

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Solution10 {
    public int RectCover(int target) {
        if (target == 0) return 0;
        else if (target == 1) return 1;
        else if (target == 2) return 2;

        int[] nums = new int[target + 1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;

        for (int i = 3; i <= target; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[target];
    }
}
