import org.junit.Test;

public class Solution17Test {

    @Test
    public void hasSubtree() {
        ______Solution17 solution17 = new ______Solution17();
        TreeNode root1 = new TreeNode(1);
        TreeNode node = new TreeNode(2);
        root1.left = node;
        TreeNode root2 = new TreeNode(1);
        boolean b = solution17.HasSubtree(root1, root2);
        System.out.println(b);
    }
}