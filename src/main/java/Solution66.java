/**
 * @ClassName Solution66
 * @Description 机器人的运动范围
 * @Author shishi
 * @Date 2020/1/23 20:50
 **/

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Solution66 {
    boolean[][] visited;

    public int movingCount(int threshold, int rows, int cols) {
        visited = new boolean[rows][cols];
        return helper(rows, cols, 0, 0, threshold);

    }

    private int helper(int rows, int cols, int i, int j, int threshold) {
        if (i < 0 || i >= rows || j < 0 || j >= cols)
            return 0;

        if (calculate(i, j) > threshold)
            return 0;
        else {
            visited[i][j] = true;
            int up = 0, down = 0, left = 0, right = 0;
            if (inArea(i - 1, j, rows, cols) && !visited[i - 1][j])
                up = helper(rows, cols, i - 1, j, threshold);
            if (inArea(i + 1, j, rows, cols) && !visited[i + 1][j])
                down = helper(rows, cols, i + 1, j, threshold);
            if (inArea(i, j - 1, rows, cols) && !visited[i][j - 1])
                left = helper(rows, cols, i, j - 1, threshold);
            if (inArea(i, j + 1, rows, cols) && !visited[i][j + 1])
                right = helper(rows, cols, i, j + 1, threshold);
            return 1 + up + down + left + right;
        }
    }

    private int calculate(int i, int j) {
        int res = 0;
        while (i != 0) {
            res += i % 10;
            i /= 10;
        }
        while (j != 0) {
            res += j % 10;
            j /= 10;
        }
        return res;
    }

    private boolean inArea(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

}
