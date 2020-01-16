import org.junit.Test;

import java.util.ArrayList;

public class Solution24Test {

    @Test
    public void findPath() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node5;

        node1.left = node3;
        node1.right = node4;


        ______Solution24 solution24 = new ______Solution24();
        ArrayList<ArrayList<Integer>> arrayLists = solution24.FindPath(root, 7);
        System.out.println(arrayLists);

    }
}