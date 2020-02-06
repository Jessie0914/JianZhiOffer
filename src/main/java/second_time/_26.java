package second_time;

import java.util.ArrayList;

/**
 * @ClassName _26
 * @Description TODO
 * @Author shishi
 * @Date 2020/2/6 14:12
 **/
public class _26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null)
            return null;
        ArrayList<TreeNode> list = new ArrayList<>();
        inOrder(pRootOfTree, list);

        // 遍历list，修改指针
        for (int i = 0; i < list.size(); i++) {
            if (i - 1 >= 0)
                list.get(i).left = list.get(i - 1);
            else
                list.get(i).left = null;

            if (i + 1 <= list.size() - 1)
                list.get(i).right = list.get(i + 1);
            else
                list.get(i).right = null;
        }
        return list.get(0);
    }


    // 中序遍历
    private void inOrder(TreeNode pRootOfTree, ArrayList<TreeNode> list) {
        if (pRootOfTree == null)
            return;

        inOrder(pRootOfTree.left, list);
        list.add(pRootOfTree);
        inOrder(pRootOfTree.right, list);
    }

}
