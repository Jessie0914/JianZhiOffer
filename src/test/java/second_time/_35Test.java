package second_time;

import org.junit.Test;

import static org.junit.Assert.*;

public class _35Test {

    @Test
    public void inversePairs() {
        _35 test = new _35();
        int[] array = {1,2,3,4,5,6,7,0};
        int i = test.InversePairs(array);
        System.out.println(i);
    }
}