package second_time;

/**
 * @ClassName _23
 * @Description 二叉搜索树的后序遍历序列
 * @Author shishi
 * @Date 2020/2/6 15:20
 **/
public class _23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    private boolean judge(int[] sequence, int start, int end) {
        if (start >= end)
            return true;
        int index = findFirstLessEle(sequence, start, end);
        // 判断从start到index为止，都是<的
        int val = sequence[end];
        for (int i = start; i < index; i++) {
            if (sequence[i] > val)
                return false;
        }
        return judge(sequence, start, index) && judge(sequence, index + 1, end - 1);
    }

    private int findFirstLessEle(int[] sequence, int start, int end) {
        int val = sequence[end];
        for (int i = end - 1; i >= start; i--) {
            if (sequence[i] <= val)
                return i;
        }
        return -1;
    }
}
