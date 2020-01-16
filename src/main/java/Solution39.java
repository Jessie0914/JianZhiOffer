/**
 * @program: jianzhioffer
 * @description: 平衡二叉树
 * @author: shishi
 * @create: 2020-01-15 21:46
 **/

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Solution39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(calculateHeigth(root.left) - calculateHeigth(root.right)) <= 1) {
            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        } else {
            return false;
        }
    }

    private int calculateHeigth(TreeNode node) {
        if (node==null) return 0;
        else {
            return Math.max(calculateHeigth(node.left)+1,calculateHeigth(node.right)+1);
        }
    }
}
