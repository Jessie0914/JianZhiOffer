import first_time._____Solution63;
import org.junit.Test;

public class Solution63Test {

    @Test
    public void test(){
        _____Solution63 solution63 = new _____Solution63();
        solution63.Insert(5);
        System.out.println(solution63.GetMedian());
        solution63.Insert(2);
        System.out.println(solution63.GetMedian());
        solution63.Insert(3);
        System.out.println(solution63.GetMedian());
    }

}