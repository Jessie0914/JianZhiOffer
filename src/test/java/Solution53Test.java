import first_time.Solution53;
import org.junit.Test;

public class Solution53Test {

    @Test
    public void isNumeric() {
        /**
         * 字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
         *  * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
         */
        Solution53 solution53 = new Solution53();
        char[] str = "123.45e+6".toCharArray();
        boolean numeric = solution53.isNumeric(str);
        System.out.println(numeric);
    }
}