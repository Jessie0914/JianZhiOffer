import org.junit.Test;

import static org.junit.Assert.*;

public class Solution13Test {

    @Test
    public void reOrderArray() {
        Solution13 solution13 = new Solution13();
        int[] array = {3,5,8,6,7,4,9};
        solution13.reOrderArray(array);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}