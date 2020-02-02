package first_time;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: jianzhioffer
 * @description: 从尾到头打印链表
 * @author: shishi
 * @create: 2020-01-13 16:53
 **/

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 */
public class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode!=null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        // 反转list
        Collections.reverse(list);
        return list;
    }
}
