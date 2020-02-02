import first_time.Solution27;
import org.junit.Test;

import java.util.ArrayList;

public class Solution27Test {

    @Test
    public void permutation() {
        Solution27 solution27 = new Solution27();
        ArrayList<String> list = solution27.Permutation("abc");
        System.out.println(list);
    }
}