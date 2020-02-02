import first_time.Solution59;
import first_time.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

public class Solution59Test {

    @Test
    public void print() {
        Solution59 solution59 = new Solution59();
        TreeNode pRoot = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        pRoot.left = node1;
        pRoot.right = node2;
        ArrayList<ArrayList<Integer>> print = solution59.Print(pRoot);
        System.out.println(print.toArray());
    }
}