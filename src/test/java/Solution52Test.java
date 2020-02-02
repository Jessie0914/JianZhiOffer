import first_time.__________Solution52;
import org.junit.Test;

public class Solution52Test {

    @Test
    public void match() {
        __________Solution52 solution52 = new __________Solution52();
        char[] str = {'a','a','a'};
        char[] pattern = "ab*a*".toCharArray();
        boolean match = solution52.match(str, pattern);
        System.out.println(match);
    }
}