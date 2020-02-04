package second_time;

import org.junit.Test;

import static org.junit.Assert.*;

public class _51Test {

    @Test
    public void multiply() {
        _51 test = new _51();
        int[] A = {1,2,3,4};
        int[] multiply = test.multiply(A);
        for (int i=0;i<multiply.length;i++){
            System.out.println(multiply[i]);
        }
    }
}