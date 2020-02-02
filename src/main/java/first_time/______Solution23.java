package first_time; /**
 * @program: jianzhioffer
 * @description: 二叉搜索树的后序遍历序列
 * @author: shishi
 * @create: 2020-01-15 13:19
 **/

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 */
public class ______Solution23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        // 特判
        if (sequence==null || sequence.length==0) return false;

        return judge(sequence, 0, sequence.length);
    }

    private boolean judge(int[] sequence, int start, int end) {
        // 终止条件
        if (start >= end) return true;

        // 根据BST的性质以及后续遍历可以得知，最后一位肯定是中位数
        int middleNum = sequence[end - 1];
        // 从后往前找第一个小于等于中位数的下标
        int index = findFirstLessThanMiddleNumIndex(sequence, start, end - 1, middleNum);


        // 判断左边的是不是都是不大于
        for (int i = start; i <= index; i++) {
            if (sequence[i] > middleNum) {
                return false;
            }
        }

        // 递归判断左子树和右子树
        return judge(sequence, start, index + 1) && judge(sequence, index + 1, end-1);
    }

    private int findFirstLessThanMiddleNumIndex(int[] sequence, int start, int end, int middleNum) {
        for (int i = end - 1; i >= start; i--) {
            if (sequence[i] <= middleNum)
                return i;
        }
        return -1;
    }
}
