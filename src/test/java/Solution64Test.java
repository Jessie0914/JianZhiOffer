import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Solution64Test {

    @Test
    public void maxInWindows() {
        Solution64 solution64 = new Solution64();
        int[] num = {10,14,12,11};
        int size = 2;
        ArrayList<Integer> list = solution64.maxInWindows2(num, size);
        System.out.println("hi");
    }
}