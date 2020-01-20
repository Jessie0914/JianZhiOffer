import org.junit.Test;

import static org.junit.Assert.*;

public class Solution50Test {

    @Test
    public void duplicate() {
        Solution50 solution50 = new Solution50();
        int[] number = {2,3,1,0,2,5,3};
        int length = 7;
        int[] duplication = new int[1];
        boolean b = solution50.duplicate(number, length, duplication);
        System.out.println(duplication[0]);
        System.out.println(b);
    }
}