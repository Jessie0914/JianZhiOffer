/**
 * @program: jianzhioffer
 * @description: 反转链表
 * @author: shishi
 * @create: 2020-01-14 18:54
 **/

/**
 * 输入一个链表，反转链表后，输出新链表的表头
 */
public class Solution15 {
    public ListNode ReverseList(ListNode head) {
        // 特判
        if (head==null) return null;

        ListNode preNode = null;

        while (head!=null&&head.next!=null){
            ListNode next = head.next;
            head.next = preNode;
            preNode = head;
            head = next;
        }

        // 最后一个单独处理
        head.next = preNode;
        return head;
    }
}
