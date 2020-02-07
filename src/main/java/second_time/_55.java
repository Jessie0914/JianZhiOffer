package second_time;

/**
 * @ClassName _55
 * @Description 链表中还的入口结点
 * @Author shishi
 * @Date 2020/2/3 15:42
 **/
public class _55 {
    int len_Circle = 1;

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        // 先判断有没有环（利用快慢指针）
        if (!hasCircle(pHead))
            return null;
        else {
            // 环的长度为len_Circle;
            // 先让p2走len_Circle步
            ListNode p1 = pHead, p2 = pHead;
            int count = 0;
            while (count < len_Circle) {
                p2 = p2.next;
                count++;
            }

            // 然后让p1和p2同时走，相遇的地方就是入口节点
            while (p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
    }

    // 判断是否存在环
    // 如果有环的话，顺带计算环的长度
    private boolean hasCircle(ListNode pHead) {
        if (pHead == null)
            return false;

        ListNode slow = pHead;
        ListNode fast = pHead.next;

        while (slow != null && fast != null) {
            // 有环
            if (slow == fast) {
                // 计算一下环的长度
                ListNode temp = slow;
                while (slow.next != temp) {
                    this.len_Circle++;
                    slow = slow.next;
                }
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
