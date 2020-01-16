/**
 * @program: jianzhioffer
 * @description: 二叉树的镜像
 * @author: shishi
 * @create: 2020-01-14 20:31
 **/

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 */
public class Solution18 {
    public void Mirror(TreeNode root) {
        if (root==null) return;

        // 先把根节点的左子树和右子树交换
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = left;
        root.left = right;

        // 递归操作左子树和右子树
        Mirror(root.left);
        Mirror(root.right);
    }
}
