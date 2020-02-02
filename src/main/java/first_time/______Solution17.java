package first_time; /**
 * @program: jianzhioffer
 * @description: 树的子结构
 * @author: shishi
 * @create: 2020-01-14 19:38
 **/

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */
public class ______Solution17 {
    // 题目中已经注明了B是A的子树
    // 题目中没有说每个节点的数值保证不一样，要注意这一点！不然有不同的解法。参考leetcode100题
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if (root1==null || root2==null) return false;

        // 如果当前节点数值一样，就试着去比较是否是子结构
        if (root1.val == root2.val)
            res =  judge(root1,root2);

        // 如果res仍然为false，那么尝试以root1.left为起点比较
        if (!res)
            res = judge(root1.left,root2);

        // 如果res仍然为false，再尝试以root1.right为起点比较
        if (!res)
            res = judge(root1.right,root2);

        return res;
    }

    private boolean judge(TreeNode root1, TreeNode root2) {
        // 如果root2已经比较到了尽头，就说明是子结构
        if (root2==null) return true;

        // 如果root2!=null但是root1已经到了尽头，那么就为false
        if (root1==null) return false;

        // 如果不相等，直接false
        if (root1.val!=root2.val) return false;

        // 剩下的就分别去比较左结构和右结构都为true，则为true
        else
            return judge(root1.left,root2.left)&&judge(root1.right,root2.right);
    }
}
