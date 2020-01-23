import org.junit.Test;

public class Solution61Test {


    @Test
    public void serialize() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;

        __________Solution61 solution61 = new __________Solution61();
        String serialize = solution61.Serialize(treeNode1);
        System.out.println(serialize);
        TreeNode deserialize = solution61.Deserialize(serialize);
        System.out.println("hi");
    }
}