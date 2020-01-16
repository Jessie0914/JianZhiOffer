import org.junit.Test;

import static org.junit.Assert.*;

public class Solution49Test {

    @Test
    public void strToInt() {
        Solution49 solution49 = new Solution49();
        String str = "-2147483648";
        int i = solution49.StrToInt(str);
        System.out.println(i);
    }
}