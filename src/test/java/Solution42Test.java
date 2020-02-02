import first_time.Solution42;
import org.junit.Test;

import java.util.ArrayList;

public class Solution42Test {

    @Test
    public void findNumbersWithSum() {
        Solution42 solution42 = new Solution42();
        int[] array = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list = solution42.FindNumbersWithSum(array, 10);
        System.out.println(list.get(0) + " " + list.get(1));
    }
}