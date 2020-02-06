package second_time;

/**
 * @ClassName _33
 * @Description 丑数
 * @Author shishi
 * @Date 2020/2/4 16:57
 **/
public class _33 {
    public int GetUglyNumber_Solution(int index) {
        if (index<=0)
            return 0;
        int[] nums = new int[index + 1];
        nums[0] = 0;
        nums[1] = 1;

        int i, j, k;
        i = j = k = 1;
        int p = 2;
        while (p <= index) {
            int temp = Math.min(nums[i] * 2, Math.min(nums[j] * 3, nums[k] * 5));
            nums[p++] = temp;
            if (temp == nums[i] * 2) i++;
            if (temp == nums[j] * 3) j++;
            if (temp == nums[k] * 5) k++;
        }
        return nums[index];
    }
}
