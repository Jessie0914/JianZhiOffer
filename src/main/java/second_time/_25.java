package second_time;

import java.util.HashMap;

/**
 * @ClassName _25
 * @Description 复杂链表的复制
 * @Author shishi
 * @Date 2020/2/6 14:44
 **/
public class _25 {
    public RandomListNode Clone(RandomListNode pHead) {
        // 存放新旧结点的映射关系
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode p = pHead;
        while (p != null) {
            map.put(p,new RandomListNode(p.label));
            p = p.next;
        }
        RandomListNode head = pHead;
        while (head!=null){
            map.get(head).next = map.get(head.next);
            map.get(head).random = map.get(head.random);
            head = head.next;
        }
        return map.get(pHead);
    }

}
