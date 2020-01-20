import org.junit.Test;

public class Solution54Test {
    @Test
    public void test(){
        Solution54 solution54 = new Solution54();
        solution54.Insert('h');
        System.out.println(solution54.FirstAppearingOnce());
        solution54.Insert('e');
        System.out.println(solution54.FirstAppearingOnce());
        solution54.Insert('l');
        System.out.println(solution54.FirstAppearingOnce());
    }

}