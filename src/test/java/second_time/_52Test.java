package second_time;

import org.junit.Test;

import static org.junit.Assert.*;

public class _52Test {

    @Test
    public void match() {
        _52 test = new _52();
        char[] str = "".toCharArray();
        char[] pattern = ".*".toCharArray();
        boolean match = test.match(str, pattern);
        System.out.println(match);
    }
}