package second_time;

import org.junit.Test;

import static org.junit.Assert.*;

public class _66Test {

    @Test
    public void movingCount() {
        _66 test = new _66();
        int i = test.movingCount(10, 1, 100);
        System.out.println(i);
    }
}