package first_time; /**
 * @ClassName Solution62
 * @Description 二叉搜索树的第k个结点
 * @Author shishi
 * @Date 2020/1/20 17:01
 **/

import java.util.ArrayList;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class Solution62 {
    // BST树的中序遍历一定是有次序的
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k <= 0) return null;

        ArrayList<TreeNode> list = new ArrayList<>();
        recursion(list, pRoot, k);

        if (k > list.size())
            return null;

        return list.get(k - 1);
    }

    private void recursion(ArrayList<TreeNode> list, TreeNode pRoot, int k) {
        if (list.size() == k) return;

        if (pRoot == null) return;

        recursion(list, pRoot.left, k);
        list.add(pRoot);
        recursion(list, pRoot.right, k);
    }
}
