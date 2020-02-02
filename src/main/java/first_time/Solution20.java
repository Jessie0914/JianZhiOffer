package first_time; /**
 * @program: jianzhioffer
 * @description: 包含min函数的栈
 * @author: shishi
 * @create: 2020-01-14 21:07
 **/

import java.util.Stack;

/**
 * 定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 */
public class Solution20 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public Solution20() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // push的时候顺带要操作minStack
    public void push(int node) {
        stack.push(node);

        if (minStack.isEmpty() || minStack.peek()>node){
            minStack.push(node);
        }
    }

    // pop的时候。也要比较pop出去的是不是最小值
    // 如果是，那么要一同pop
    public void pop() {
        Integer pop = stack.pop();
        if (pop==minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
