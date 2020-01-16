/**
 * @program: jianzhioffer
 * @description: 链表中倒数第k个结点
 * @author: shishi
 * @create: 2020-01-14 17:21
 **/

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        int size = 0;
        ListNode p = head;
        while (p!=null){
            size++;
            p = p.next;
        }

        int index = size-k;
        if (index<0)
            return null;

        while (index>0){
            head = head.next;
            index--;
        }
        return head;
    }
}
