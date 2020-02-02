import first_time.ListNode;
import first_time.___Solution56;
import org.junit.Test;

public class Solution56Test {

    @Test
    public void deleteDuplication() {
        ___Solution56 solution56 = new ___Solution56();
        ListNode phead = new ListNode(2);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(2);
        ListNode p4 = new ListNode(2);
        ListNode p5 = new ListNode(2);

        phead.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        ListNode listNode = solution56.deleteDuplication(phead);
        System.out.println(listNode);
    }
}