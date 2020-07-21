import first_time.Solution6;
import org.junit.Test;

public class Solution6Test {

    @Test
    public void minNumberInRotateArray() {
        Solution6 solution6 = new Solution6();
        int[] array = {3,3};
        int i = solution6.minNumberInRotateArray(array);
        System.out.println(i);
    }
}