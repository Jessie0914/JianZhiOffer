package second_time;

/**
 * @ClassName _23
 * @Description 二叉搜索树的后序遍历序列
 * @Author shishi
 * @Date 2020/2/6 15:20
 **/
public class _23 {
    // 递归
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    private boolean judge(int[] sequence, int start, int end) {
        // 系好安全带
        if (start >= end)
            return true;

        // 判断比end小的第一个下标
        int index = findFirstLessEle(sequence, start, end);

        // 判断从start到index为止是否都是小于end的
        int val = sequence[end];
        for (int i = start; i < index; i++) {
            // 只要出现一个大于end元素的，就false
            if (sequence[i] > val)
                return false;
        }
        // 然后再递归判断左边的、右边的
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
