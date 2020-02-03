package second_time;

import org.junit.Test;

import static org.junit.Assert.*;

public class _65Test {

    @Test
    public void hasPath() {
        _65 test = new _65();
        char[] matrix = "ABCESFCSADEE".toCharArray();
        int rows = 3;
        int cols = 4;
        char[] str = "ABCB".toCharArray();
        boolean b = test.hasPath(matrix, rows, cols, str);
        System.out.println(b);
    }
}