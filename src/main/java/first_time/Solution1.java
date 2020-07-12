package first_time;

/**
 * @program: jianzhioffer
 * @description: 二维数组中的查找
 * @author: shishi
 * @create: 2020-01-13 15:51
 **/

public class Solution1 {
    public boolean Find(int target, int[][] array) {
        int len = array.length;
        // 特判
        if (len == 0) return false;

        int width = array[0].length;
        if (width == 0) return false;

        int j = 0, i = 0;
        while (j < width && array[0][j] <= target) {
            if (array[0][j] == target)
                return true;
            j++;
        }
        if (j == width) return false;

        while (i < len && array[i][0] <= target) {
            if (array[i][0] == target)
                return true;
            i++;
        }

        for (int p = 0; p < i; p++) {
            for (int q = 0; q < j; q++) {
                if (array[p][q] == target)
                    return true;
            }
        }
        return false;
    }

    // https://www.nowcoder.com/questionTerminal/abc3fe2ce8e146608e868a70efebf62e?f=discussion
    // 对于左下角来说，往上是递减，往右是递增，所以从左下角开始判断
    // 嫌大，就往上；嫌小，就往右
    public boolean Find2(int target, int[][] array) {
        int row = array.length;
        int col = array[0].length;

        int i = row - 1;
        int j = 0;
        while (i >= 0 && j < col) {
            if (array[i][j] == target)
                return true;
            else if (array[i][j] > target)
                i--;
            else
                j++;
        }
        return false;
    }
}
