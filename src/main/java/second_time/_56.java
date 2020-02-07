package second_time;

/**
 * @ClassName _56
 * @Description 删除链表中重复的结点
 * @Author shishi
 * @Date 2020/2/3 15:33
 **/
public class _56 {
    public ListNode deleteDuplication(ListNode pHead) {
        // 构造一个前置结点与pHead相连
        ListNode pre = new ListNode(-1);
        pre.next = pHead;
        ListNode dummyNode = pre;

        while (pHead != null && pHead.next != null) {
            if (pHead.val != pHead.next.val) {
                pre = pHead;
                pHead = pHead.next;
            } else {
                int temp = pHead.val;
                while (pHead != null && pHead.val == temp) {
                    pHead = pHead.next;
                }
                pre.next = pHead;
            }
        }

        return dummyNode.next;
    }
}
