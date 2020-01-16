import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void replaceSpace() {
        Solution2 solution2 = new Solution2();
        StringBuffer str = new StringBuffer("We Are Happy");
        String s = solution2.replaceSpace(str);
        System.out.println(s);
    }
}