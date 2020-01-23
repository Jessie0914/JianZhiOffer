import org.junit.Test;

public class Solution65Test {

    @Test
    public void hasPath() {
        __________Solution65 solution65 = new __________Solution65();
        char[] matrix = "ABCESFCSADEE".toCharArray();
        int rows = 3;
        int cols = 4;
        char[] str = "SEE".toCharArray();
        boolean b = solution65.hasPath(matrix, rows, cols, str);
        System.out.println(b);
    }
}