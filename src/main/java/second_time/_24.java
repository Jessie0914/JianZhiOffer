package second_time;

import java.util.ArrayList;

/**
 * @ClassName _24
 * @Description 二叉树中和为某一值的路径
 * @Author shishi
 * @Date 2020/2/6 15:50
 **/
public class _24 {
    // DFS
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        // dfs函数
        helper(root, target, result, cur, 0);
        return result;
    }

    private void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> cur, int sum) {
        // 如果已经遍历到空节点了，就返回
        if (root == null)
            return;

        // 先添加当前结点
        cur.add(root.val);
        // 如果当前节点已经是叶子节点
        if (root.left == null && root.right == null) {
            // 则判断当前sum+当前节点的值是不是等于target
            if (sum + root.val == target)
                result.add(new ArrayList<>(cur));
        }
        // 如果不是叶子节点，继续遍历左右子树
        else {
            helper(root.left, target, result, cur, sum + root.val);
            helper(root.right, target, result, cur, sum + root.val);
        }
        // 如果不满足条件或者已经遍历到底了，则回退一步
        cur.remove(cur.size() - 1);
    }
}
