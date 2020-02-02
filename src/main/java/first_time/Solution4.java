package first_time; /**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树
 * 前序遍历序列{1,2,4,7,3,5,6,8}
 * 中序遍历序列{4,7,2,1,5,3,8,6}
 */

/**
 * @program: jianzhioffer
 * @description: 重建二叉树
 * @author: shishi
 * @create: 2020-01-13 17:01
 **/

public class Solution4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return constructTree(pre,0,pre.length,in,0,in.length);
    }

    private TreeNode constructTree(int[] pre, int s1, int e1, int[] in, int s2, int e2) {
        if (s1==e1) return null;
        if (s2==e2) return null;

        TreeNode root = new TreeNode(pre[s1]);
        int middlePos = findMiddlePos(in,s2,e2,root.val);
        int leftSize = middlePos - s2;
        root.left =constructTree(pre,s1+1,s1+1+leftSize,in,s2,middlePos);
        root.right = constructTree(pre,s1+1+leftSize,e1,in,middlePos+1,e2);

        return root;
    }

    private int findMiddlePos(int[] in, int s2, int e2, int val) {
        for (int i=s2;i<e2;i++){
            if (in[i]==val){
                return i;
            }
        }
        return -1;
    }
}
