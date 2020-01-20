/**
 * @ClassName ___Solution56
 * @Description 删除链表中重复的结点
 * @Author shishi
 * @Date 2020/1/20 13:22
 **/

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class ___Solution56 {
    public ListNode deleteDuplication(ListNode pHead) {
        // 特判
        if (pHead == null || pHead.next == null) return pHead;

        // 构造一个虚拟节点，作为前序结点
        ListNode pre = new ListNode(0);
        // 最后返回dummy.next即可
        ListNode dummy = pre;

        // 把构建的虚拟前序结点与pHead连接起来
        pre.next = pHead;
        ListNode p = pHead;

        // 如果p本身是null或者next为null的话，就跳出循环
        while (p != null && p.next != null) {
            // 如果下一个结点和自己的值不一样
            // 那么就直接更新pre和p的值
            if (p.val != p.next.val) {
                pre = p;
                p = p.next;
            }
            // 如果碰到了重复结点
            else {
                // 首先要找到下一个结点不和p一样的结点
                while (p.next != null && p.next.val == p.val) {
                    p = p.next;
                }
                // pre.next指向第一个不和p值一样的结点
                // 这样做，就相当于删除了那些与p结点值重复的结点
                pre.next = p.next;
                // 把p也前进一位
                p = p.next;
            }
        }
        return dummy.next;
    }
}
