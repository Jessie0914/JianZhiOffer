package first_time; /**
 * @program: jianzhioffer
 * @description: 从上往下打印二叉树
 * @author: shishi
 * @create: 2020-01-15 12:42
 **/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root==null) return list;

        // 用的是Queue，而不是Stack
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            list.add(poll.val);
            if (poll.left!=null)
                queue.add(poll.left);
            if (poll.right!=null)
                queue.add(poll.right);
        }
        return list;
    }
}
