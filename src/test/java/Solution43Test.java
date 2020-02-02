import first_time.Solution43;
import org.junit.Test;

public class Solution43Test {

    @Test
    public void leftRotateString() {
        Solution43 solution43 = new Solution43();
        String str = "abcXYZdef";
        int n = 3;
        String s = solution43.LeftRotateString(str, n);
        System.out.println(s);
    }
}