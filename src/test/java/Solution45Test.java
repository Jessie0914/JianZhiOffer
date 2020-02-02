import first_time.Solution45;
import org.junit.Test;

public class Solution45Test {

    @Test
    public void isContinuous() {
        Solution45 solution45 = new Solution45();
        int[] numbers = {1,0,1,0,0};
        boolean b = solution45.isContinuous(numbers);
        System.out.println(b);
    }
}