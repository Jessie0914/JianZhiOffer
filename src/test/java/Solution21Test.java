import org.junit.Test;

import static org.junit.Assert.*;

public class Solution21Test {

    @Test
    public void isPopOrder() {
        Solution21 solution21 = new Solution21();
        int[] pushA = {1,2,3,4,5};
        int[] pushB = {4,5,5,2,1};
        boolean b = solution21.IsPopOrder(pushA, pushB);
        System.out.println(b);
    }
}