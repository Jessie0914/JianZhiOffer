package second_time;

/**
 * @ClassName _17
 * @Description 树的子结构
 * @Author shishi
 * @Date 2020/2/6 17:39
 **/
public class _17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        // 特判
        if (root1 == null || root2 == null)
            return false;

        boolean flag = true;

        // 先从根节点开始判断
        flag = judge(root1, root2);
        if (flag)
            return true;
            // 再去尝试根节点的左子树
        else {
            flag = HasSubtree(root1.left, root2);
            if (flag)
                return true;
                // 最后尝试根节点的右子树
            else
                return HasSubtree(root1.right, root2);
        }
    }

    private boolean judge(TreeNode A, TreeNode B) {
        // 如果A已经为null，但B仍然有分支，则false
        if (A == null && B != null)
            return false;

        // 如果B已经遍历到了最后，说明是子树，true
        if (B == null)
            return true;

        // 如果当前节点相等，则递归比较左、右子树
        if (A.val == B.val) {
            return judge(A.left, B.left) && judge(A.right, B.right);
        }
        // 否则，直接为false
        else
            return false;
    }
}
