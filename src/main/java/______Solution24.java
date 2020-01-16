import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @program: jianzhioffer
 * @description: 二叉树中和为某一值的路径
 * @author: shishi
 * @create: 2020-01-15 14:31
 **/

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 * 笔记
 * 收藏
 * 纠错
 */
public class ______Solution24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();

        recursion(root, target, res, cur);

        // 排序。使得长度长的排在前面
        Collections.sort(res, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.size() - o1.size();
            }
        });

        return res;

    }

    private void recursion(TreeNode root, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> cur) {
        if (root == null) return;

        // 先添加了再说
        cur.add(root.val);

        // 如果是叶子节点了
        if (root.left == null && root.right == null) {
            // 符合条件，则添加
            if (target == root.val)
                res.add(new ArrayList<>(cur));
        }

        // 如果不是叶子节点，递归遍历左右子树
        else {
            recursion(root.left, target - root.val, res, cur);
            recursion(root.right, target - root.val, res, cur);
        }

        // 如果都不符合条件或者左右子树都已经遍历完毕，那么回退一步
        cur.remove(cur.size() - 1);
    }
}
