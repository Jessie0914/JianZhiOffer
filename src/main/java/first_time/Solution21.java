package first_time; /**
 * @program: jianzhioffer
 * @description: 栈的压入、弹出序列
 * @author: shishi
 * @create: 2020-01-15 12:20
 **/

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class Solution21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        int len = pushA.length;
        if (len!=popA.length) return false;

        int i = 0, j = 0;
        Stack<Integer> pushStack = new Stack<>();

        while (i<len){
            pushStack.push(pushA[i]);
            i++;

            // 判断是不是和pop栈的栈顶元素一样
            if (pushStack.peek()==popA[j]){
                pushStack.pop();
                j++;
            }
        }

        // 注意这里先要判断stack是否为空，不然可能会抛异常
        while (!pushStack.isEmpty() && pushStack.peek()==popA[j]){
            pushStack.pop();
            j++;
        }

        if (!pushStack.isEmpty()) return false;

        return true;
    }
}
