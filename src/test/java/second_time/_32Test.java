package second_time;

import org.junit.Test;

import static org.junit.Assert.*;

public class _32Test {

    @Test
    public void printMinNumber() {
        _32 test = new _32();
        int[] numbers = {3,5,1,4,2};
        String s = test.PrintMinNumber(numbers);
        System.out.println(s);
    }
}