package second_time;

/**
 * @ClassName _17
 * @Description TODO
 * @Author shishi
 * @Date 2020/2/6 17:39
 **/
public class _17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;

        boolean flag = true;

        flag =  judge(root1, root2);
        if (flag)
            return true;
        else {
            flag = judge(root1.left,root2);
            if (flag)
                return true;
            else
                return judge(root1.right,root2);
        }
    }

    private boolean judge(TreeNode A, TreeNode B) {
        if (A==null && B!=null)
            return false;

        if (B==null)
            return true;

        if (A.val==B.val){
            return judge(A.left,B.left) && judge(A.right,B.right);
        }else
            return false;
    }
}
