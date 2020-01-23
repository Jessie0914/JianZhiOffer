
/**
 * @ClassName __________Solution65
 * @Description 矩阵中的路径
 * @Author shishi
 * @Date 2020/1/23 15:54
 **/
public class __________Solution65 {
    boolean[] visited;
    // 上下左右四个方向
    int[][] d = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        visited = new boolean[matrix.length];
        // 从每一个位置开始遍历
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 核心函数
                if (search(matrix, rows, cols, i, j, str, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean search(char[] matrix, int rows, int cols, int startX, int startY, char[] str, int index) {
        // 如果只剩最后一个字符没有匹配了，就只需要比较最后一个字符是否相等
        if (index == str.length - 1)
            return matrix[startX * cols + startY] == str[index];

        // 如果当前字符相等
        if (matrix[startX * cols + startY] == str[index]) {
            // 首先先置为true
            visited[startX * cols + startY] = true;

            // 分别向4个方向去找
            for (int i = 0; i < 4; i++) {
                // 新坐标
                int newX = startX + d[i][0];
                int newY = startY + d[i][1];
                // 如果不越界且还没有被访问过
                if (inArea(newX, newY, rows, cols) && !visited[newX * cols + newY]) {
                    // 就去用新的坐标开始取匹配下一个字符开始的str
                    if (search(matrix, rows, cols, newX, newY, str, index + 1))
                        return true;
                }
            }

            // 如果不匹配，就回退一步，置为false
            visited[startX * cols + startY] = false;
        }
        return false;
    }

    // 判断有没有越界
    private boolean inArea(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
