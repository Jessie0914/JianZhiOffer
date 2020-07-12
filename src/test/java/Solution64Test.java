import first_time.Solution64;
import org.junit.Test;

import java.util.ArrayList;

public class Solution64Test {

    @Test
    public void maxInWindows() {
        Solution64 solution64 = new Solution64();
        int[] num = {10,14,12,11};
        int size = 2;
        ArrayList<Integer> list = solution64.maxInWindows3(num, size);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}