/**
 * @program: jianzhioffer
 * @description: 二叉树的深度
 * @author: shishi
 * @create: 2020-01-15 21:42
 **/

/**
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class Solution38 {
    public int TreeDepth(TreeNode root) {
        if (root==null) return 0;
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if (root==null) return 0;
        else {
            return Math.max(dfs(root.left)+1,dfs(root.right)+1);
        }
    }
}
