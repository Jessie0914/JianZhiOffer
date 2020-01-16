import org.junit.Test;

import static org.junit.Assert.*;

public class Solution5Test {

    @Test
    public void push() {
        Solution5 solution5 = new Solution5();
        solution5.push(2);
        solution5.push(5);
        int pop = solution5.pop();
        System.out.println(pop);
        System.out.println(solution5.pop());

    }

    @Test
    public void pop() {
    }
}