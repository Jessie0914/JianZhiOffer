package first_time; /**
 * @ClassName Solution59
 * @Description 按之字形顺序打印二叉树
 * @Author shishi
 * @Date 2020/1/20 15:21
 **/

import java.util.*;

/**
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，
 * 其他行以此类推。
 */
public class Solution59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        boolean flag = true;

        queue.add(pRoot);
        while (!queue.isEmpty() || !stack.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            // 正向输出，用的是queue
            if (flag) {
                Iterator<TreeNode> iterator = queue.iterator();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
                    temp.add(poll.val);
                    if (poll.left != null)
                        queue.add(poll.left);
                    if (poll.right != null)
                        queue.add(poll.right);
                }
                list.add(temp);
                flag = false;
            } else {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode poll = queue.poll();
                    if (poll.left != null)
                        queue.add(poll.left);
                    if (poll.right != null)
                        queue.add(poll.right);

                    stack.push(poll);
                }
                while (!stack.isEmpty()) {
                    temp.add(stack.pop().val);
                }
                list.add(temp);
                flag = true;
            }
        }
        return list;
    }
}
