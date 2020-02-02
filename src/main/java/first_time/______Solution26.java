package first_time; /**
 * @program: jianzhioffer
 * @description: 二叉搜索树与双向链表
 * @author: shishi
 * @create: 2020-01-15 15:39
 **/


import java.util.ArrayList;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class ______Solution26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null) return null;

        ArrayList<TreeNode> list = new ArrayList<>();

        // list保存中序遍历的结果
        inOrderTraversal(pRootOfTree, list);

        // 遍历list，修改指针
        for (int i = 0; i < list.size(); i++) {
            TreeNode cur = list.get(i);
            if (i-1>=0)
                cur.left = list.get(i-1);
            else cur.left = null;

            if (i+1<list.size())
                cur.right = list.get(i+1);
            else cur.right = null;
        }

        return list.get(0);
    }

    private void inOrderTraversal(TreeNode pRootOfTree, ArrayList<TreeNode> list) {
        if (pRootOfTree == null) return;

        inOrderTraversal(pRootOfTree.left, list);
        list.add(pRootOfTree);
        inOrderTraversal(pRootOfTree.right, list);
    }

}
