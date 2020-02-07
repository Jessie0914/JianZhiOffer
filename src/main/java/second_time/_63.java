package second_time;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ClassName _63
 * @Description 数据流中的中位数
 * @Author shishi
 * @Date 2020/2/3 13:20
 **/
public class _63 {
    // 用最小堆和最大堆
    // minHeap存放大的一半元素
    // maxHeap存放小的一半元素
    int count = 0;// 总数
    // 当count为偶数时，先插入到maxHeap，然后移动一个元素到minHeap
    // 当count为奇数时，先插入到minHeap，然后移动一个元素到maxHeap
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void Insert(Integer num) {
        if (count % 2 == 0) {
            count++;
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        } else {
            count++;
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
    }

    public Double GetMedian() {
        if (count % 2 == 1)
            return new Double(minHeap.peek());
        else
            return new Double(minHeap.peek() + maxHeap.peek()) / 2;
    }
}
