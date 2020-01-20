/**
 * @ClassName __________Solution51
 * @Description 构建乘积数组
 * @Author shishi
 * @Date 2020/1/18 13:09
 **/

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 */
public class __________Solution51 {
    // 题意就是B[i] = 所有除了i位以外的A数组中元素的乘积
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        // 特判
        if (len == 0)
            return B;
        else if (len == 1) {
            B[0] = 1;
            return B;
        } else if (len == 2) {
            B[0] = A[1];
            B[1] = A[0];
            return B;
        }

        // 第一个for循环
        // 循环结束之后，B[n-1]已经就位
        B[0] = 1;
        for (int i = 1; i < len; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }

        // 第二个for循环
        int temp = A[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            B[i] *= temp;
            temp *= A[i];
        }

        return B;
    }
}

