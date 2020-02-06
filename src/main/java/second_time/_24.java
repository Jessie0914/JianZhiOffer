package second_time;

import java.util.ArrayList;

/**
 * @ClassName _24
 * @Description 二叉树中和为某一值的路径
 * @Author shishi
 * @Date 2020/2/6 15:50
 **/
public class _24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        helper(root, target, result, cur, 0);
        return result;
    }

    private void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> cur, int sum) {
        if (root == null)
            return;

        // 先添加结点
        cur.add(root.val);
        // 如果已经是叶子节点了
        if (root.left == null && root.right == null) {
            // 判断当前sum+当前节点的值是不是等于target
            if (sum + root.val == target)
                result.add(new ArrayList<>(cur));
        }
        // 继续遍历左右子树
        else {
            helper(root.left, target, result, cur, sum + root.val);
            helper(root.right, target, result, cur, sum + root.val);
        }
        cur.remove(cur.size() - 1);
    }
}
