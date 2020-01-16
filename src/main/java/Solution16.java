/**
 * @program: jianzhioffer
 * @description: 合并两个排序的链表
 * @author: shishi
 * @create: 2020-01-14 19:10
 **/

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表
 * 当然我们需要合成后的链表满足单调不减规则
 */
public class Solution16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while (list1 != null && list2 != null){
            int val1 = list1.val;
            int val2 = list2.val;

            if (val1<val2){
                dummy.next = list1;
                list1 = list1.next;
                dummy = dummy.next;
                dummy.next = null;
            }

            else {
                dummy.next = list2;
                list2 = list2.next;
                dummy = dummy.next;
                dummy.next = null;
            }
        }

        if (list1!=null){
            dummy.next = list1;
        }
        else {
            dummy.next = list2;
        }
        return head.next;
    }
}
