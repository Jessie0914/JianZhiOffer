package first_time;

import java.util.Stack;

/**
 * @program: jianzhioffer
 * @description: 用两个栈实现队列
 * @author: shishi
 * @create: 2020-01-14 14:16
 **/

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 */
public class Solution5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    // 重点是这里，需要保证先进先出
    public int pop() {
        // 把stack1中的所有元素都放在stack2中
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        Integer pop = stack2.pop();

        // 再把stack2中的数据传回stack1中
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return pop;
    }
}
