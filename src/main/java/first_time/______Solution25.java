package first_time; /**
 * @program: jianzhioffer
 * @description: 复杂链表的复制
 * @author: shishi
 * @create: 2020-01-15 14:57
 **/

import java.util.HashMap;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class ______Solution25 {
    // 完全没有遇到过，新案例
    public RandomListNode Clone(RandomListNode pHead) {

        HashMap<RandomListNode, RandomListNode> hashMap = new HashMap<>();
        RandomListNode p = pHead;
        RandomListNode p1 = pHead;

        // 建立一个HashMap保存：旧节点--新建立的节点 之间的映射关系
        while (p != null) {
            hashMap.put(p, new RandomListNode(p.label));
            p = p.next;
        }

        // 然后遍历map，把next和random指针补充完整
        // 通过取map中的key（旧节点）得到value（新节点）
        while (p1 != null) {
            hashMap.get(p1).next = hashMap.get(p1.next);
            hashMap.get(p1).random = hashMap.get(p1.random);
            p1 = p1.next;
        }

        return hashMap.get(pHead);
    }
}
