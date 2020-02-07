package second_time;

/**
 * @ClassName _66
 * @Description 机器人的运动范围
 * @Author shishi
 * @Date 2020/2/2 23:03
 **/
public class _66 {
    int row;
    int col;
    int count = 0;

    public int movingCount(int threshold, int rows, int cols) {
        row = rows;
        col = cols;
        boolean[][] visited = new boolean[rows][cols];
        recursion(threshold, visited, 0, 0);
//        // 或者遍历visited数组，累加true的个数，也是最终结果
//        int res = 0;
//        for (int i=0;i<rows;i++){
//            for (int j=0;j<cols;j++){
//                if (visited[i][j])
//                    res++;
//            }
//        }
        return count;
    }

    private void recursion(int threshold, boolean[][] visited, int i, int j) {
        // 退出条件（不在边界内）
        if (!LegalPos(i, j))
            return;

        if (judge(i, j) > threshold)
            return;

        else {
            if (!visited[i][j]) {
                visited[i][j] = true;
                count++;
            }
            // 上下左右四个方向判断
            if (LegalPos(i + 1, j) && !visited[i + 1][j])
                recursion(threshold, visited, i + 1, j);
            if (LegalPos(i - 1, j) && !visited[i - 1][j])
                recursion(threshold, visited, i - 1, j);
            if (LegalPos(i, j - 1) && !visited[i][j - 1])
                recursion(threshold, visited, i, j - 1);
            if (LegalPos(i, j + 1) && !visited[i][j + 1])
                recursion(threshold, visited, i, j + 1);

            visited[i][j] = false;
        }
    }

    private int judge(int i, int j) {
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

    private boolean LegalPos(int i, int j) {
        if (i >= 0 && i < row && j >= 0 && j < col)
            return true;
        return false;
    }
}
