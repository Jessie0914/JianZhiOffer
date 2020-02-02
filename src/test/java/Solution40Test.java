import first_time.Solution40;
import org.junit.Test;

public class Solution40Test {

    @Test
    public void findNumsAppearOnce() {
        Solution40 solution40 = new Solution40();
        int[] array = {1,1,2,3,4,4};
        int[] nums1 = new int[1];
        int[] nums2 = new int[1];
        solution40.FindNumsAppearOnce(array,nums1,nums2);
        System.out.println(nums1[0] + " " + nums2[0]);
    }
}