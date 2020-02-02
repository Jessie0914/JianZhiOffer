package first_time; /**
 * @program: jianzhioffer
 * @description: 两个链表的第一个公共结点
 * @author: shishi
 * @create: 2020-01-15 21:13
 **/

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class __________Solution36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null || pHead2==null) return null;

        // 如果两条链表是相交叉的，那么“人工构成一个环之后”，遍历第二次中奖会相遇
        ListNode p1 = pHead1, p2 = pHead2;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
            if (p1!=p2){
                if (p1 == null)
                    p1 = pHead2;
                if (p2 == null)
                    p2 = pHead1;
            }
        }
        return p1;
    }
}
