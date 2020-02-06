package second_time;

/**
 * @ClassName _10
 * @Description 矩形覆盖
 * @Author shishi
 * @Date 2020/2/6 17:57
 **/
public class _10 {
    // 斐波那契数列
    public int RectCover(int target) {
        int[] nums = new int[target + 1];
        if (target <= 0)
            return 0;
        else if (target == 1)
            return 1;
        else if (target == 2)
            return 2;

        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= target; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[target];
    }
}
