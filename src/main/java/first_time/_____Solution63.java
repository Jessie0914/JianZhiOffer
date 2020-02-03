package first_time; /**
 * @ClassName _____Solution63
 * @Description 数据流中的中位数
 * @Author shishi
 * @Date 2020/1/20 17:38
 **/

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class _____Solution63 {
    // 用到的是大顶堆+小顶堆

    // 小顶堆中存放的是大的元素
    // 大顶堆中存放的是小的元素
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    // 总的元素个数
    int count = 0;

    public void Insert(Integer num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if (count % 2 == 0)
            return new Double(maxHeap.peek() + minHeap.peek()) / 2;
        else
            return new Double(minHeap.peek());
    }
}
