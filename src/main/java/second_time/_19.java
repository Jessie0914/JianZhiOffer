package second_time;

import java.util.ArrayList;

/**
 * @ClassName _19
 * @Description 顺时针打印矩阵
 * @Author shishi
 * @Date 2020/2/6 17:06
 **/
public class _19 {
    // 这种一般都需要up、down、left、right四个指针去遍历
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int up = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (true) {
            // 向右
            for (int i = left; i <= right; i++)
                list.add(matrix[up][i]);
            up++;
            if (up > down)
                break;

            // 向下
            for (int i = up; i <= down; i++)
                list.add(matrix[i][right]);
            right--;
            if (right < left)
                break;

            // 向左
            for (int i = right; i >= left; i--)
                list.add(matrix[down][i]);
            down--;
            if (down < up)
                break;

            // 向上
            for (int i = down; i >= up; i--)
                list.add(matrix[i][left]);
            left++;
            if (left > right)
                break;
        }

        return list;
    }
}
