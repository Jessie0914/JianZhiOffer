/**
 * @ClassName ___Solution57
 * @Description 二叉树的下一个结点
 * @Author shishi
 * @Date 2020/1/20 14:18
 **/

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class ___Solution57 {
    // 只要分成有right和无right两种情况
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        // 如果有right，直接返回右子树的第一个结点
        if (pNode.right != null) {
            TreeLinkNode p = pNode.right;
            while (p.left != null) {
                p = p.left;
            }
            return p;
        } else {
            TreeLinkNode p = pNode;
            while (p.next != null && p.next.left != p) {
                p = p.next;
            }
            return p.next;
        }
    }
}
