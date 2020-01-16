import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Solution22Test {

    @Test
    public void printFromTopToBottom() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;

        Solution22 solution22 = new Solution22();
        ArrayList<Integer> list = solution22.PrintFromTopToBottom(root);
        System.out.println(list);

    }
}