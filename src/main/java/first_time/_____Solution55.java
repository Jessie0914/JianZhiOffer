package first_time; /**
 * @ClassName _____Solution55
 * @Description 链表中环的入口结点
 * @Author shishi
 * @Date 2020/1/18 16:58
 **/


/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class _____Solution55 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;

        ListNode p1 = pHead;
        ListNode p2 = pHead.next;
        while (p1 != p2 && p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        if (p2 == null || p2.next == null)
            return null;

        // 剩下的情况是必有环的，只不过不知道哪个是入口的结点

        // 先确定环的长度
        ListNode dummy = p2;
        int lenOfCircle = 1;
        while (dummy.next != p2) {
            lenOfCircle++;
            dummy = dummy.next;
        }

        p1 = p2 = pHead;
        for (int i = 0; i < lenOfCircle; i++) {
            p2 = p2.next;
        }

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}
