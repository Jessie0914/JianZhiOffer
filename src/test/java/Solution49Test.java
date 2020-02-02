import first_time.Solution49;
import org.junit.Test;

public class Solution49Test {

    @Test
    public void strToInt() {
        Solution49 solution49 = new Solution49();
        String str = "-2147483648";
        int i = solution49.StrToInt(str);
        System.out.println(i);
    }
}