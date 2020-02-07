package second_time;

import java.util.Arrays;

/**
 * @ClassName _51
 * @Description 构建乘积数组
 * @Author shishi
 * @Date 2020/2/3 22:48
 **/
public class _51 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        Arrays.fill(B, 1);
        // 先从前往后乘（到i前停止）
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                B[i] *= A[j];
            }
        }
        // 再从后往前乘，temp值不断累加
        int temp = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            B[i] *= temp;
            temp *= A[i];
        }

        return B;
    }
}
