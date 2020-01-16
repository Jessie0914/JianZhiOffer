import org.junit.Test;

import static org.junit.Assert.*;

public class Solution30Test {

    @Test
    public void findGreatestSumOfSubArray() {
        Solution30 solution30 = new Solution30();
        int[] array = {6,-3,-2,7,-15,1,2,2};
        int i = solution30.FindGreatestSumOfSubArray(array);
        System.out.println(i);
    }
}