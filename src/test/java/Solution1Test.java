import first_time.Solution1;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void find() {
        Solution1 solution1 = new Solution1();
        int[][] array = {{}};
        boolean b = solution1.Find(16, array);
        System.out.println(b);

    }
}