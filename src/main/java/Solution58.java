/**
 * @ClassName Solution58
 * @Description 对称的二叉树
 * @Author shishi
 * @Date 2020/1/20 15:11
 **/

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class Solution58 {
    public boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        if (pRoot.left == null && pRoot.right != null) return false;
        if (pRoot.left != null && pRoot.right == null) return false;

        return isMirror(pRoot.left, pRoot.right);
    }

    private boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;

        if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
            return false;

        if (root1.val != root2.val)
            return false;

        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }
}
