package first_time; /**
 * @ClassName Solution60
 * @Description 把二叉树打印成多行
 * @Author shishi
 * @Date 2020/1/20 16:00
 **/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Solution60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                temp.add(poll.val);
                if (poll.left != null)
                    queue.add(poll.left);
                if (poll.right != null)
                    queue.add(poll.right);
            }
            list.add(temp);
        }

        return list;
    }
}
