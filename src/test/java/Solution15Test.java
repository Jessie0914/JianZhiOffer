import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution15Test {

    @Test
    public void reverseList() {
        Solution15 solution15 = new Solution15();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node = solution15.ReverseList(head);
        System.out.println("hi");
    }
}