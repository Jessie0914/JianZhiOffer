package second_time;

/**
 * @ClassName _65
 * @Description TODO
 * @Author shishi
 * @Date 2020/2/3 11:15
 **/
public class _65 {
    int row;
    int col;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        this.row = rows;
        this.col = cols;
        int cur_index = 0;

        char[][] chars = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                chars[i][j] = matrix[cur_index++];
            }
        }

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(visited, chars, i, j, str, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean helper(boolean[][] visited, char[][] chars, int i, int j, char[] str, int index) {
        // 如果不匹配直接false
        if (chars[i][j] != str[index])
            return false;

        // 如果已经访问过了，直接false
        if (visited[i][j])
            return false;

        // 如果当前还未访问且是最后一个匹配，那么为true
        if (!visited[i][j] && index==str.length-1 && chars[i][j] == str[str.length-1])
            return true;

        // 否则，就上下左右四个方向继续匹配
        else {
            visited[i][j] = true;
            // 上
            if (inArea(i - 1, j) && helper(visited, chars, i - 1, j, str, index + 1))
                return true;
            // 下
            if (inArea(i+1,j)&& helper(visited,chars,i+1,j,str,index+1))
                return true;
            // 左
            if (inArea(i,j-1)&&helper(visited,chars,i,j-1,str,index+1))
                return true;
            // 右
            if (inArea(i,j+1)&&helper(visited,chars,i,j+1,str,index+1))
                return true;

            // 都不匹配，则回退一步
            visited[i][j] = false;
        }

        return false;
    }

    private boolean inArea(int i, int j) {
        if (i>=0 && i<row && j>=0 && j<col)
            return true;
        return false;
    }
}
