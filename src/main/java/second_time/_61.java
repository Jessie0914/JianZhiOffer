package second_time;

/**
 * @ClassName _61
 * @Description 序列化二叉树
 * @Author shishi
 * @Date 2020/2/3 13:55
 **/

/**
 * 序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，
 * 序列化时通过 某种符号表示空节点（#），以 ！ 表示一个结点值的结束（value!）。
 * 二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 */
public class _61 {
    int index = -1;

    String Serialize(TreeNode root) {
        if (root == null)
            return "#!";
        else
            return root.val + "!" + Serialize(root.left) + Serialize(root.right);
    }

    // 反序列化
    TreeNode Deserialize(String str) {
        String[] split = str.split("!");
        TreeNode root = null;

        // 无论是不是null，都要index++;
        index++;

        // 如果到了数组末尾，直接返回
        if (index > split.length)
            return null;

        // 如果当前数组元素不为#
        if (!split[index].equals("#")) {
            // 构建一个结点，并递归构建左子树和右子树
            root = new TreeNode(Integer.parseInt(split[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }
        // 如果为空，则直接构造空节点
        else {
            return null;
        }

        return root;
    }
}
