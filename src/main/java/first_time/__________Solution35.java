package first_time; /**
 * @program: jianzhioffer
 * @description: 数组中的逆序对
 * @author: shishi
 * @create: 2020-01-15 20:49
 */

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 输入：1,2,3,4,5,6,7,0
 * 输出：7
 */

public class __________Solution35 {
    public int InversePairs(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }

        int res = mergeSort(array, 0, array.length-1) % 1000000007;
        return res % 1000000007;
    }

    // 分段
    private int mergeSort(int[] array, int low, int high) {
        if (low == high)
            return 0;

        int mid = (low + high) / 2;

        int left = mergeSort(array, low, mid)% 1000000007;
        int right = mergeSort(array, mid+1, high)% 1000000007;
        return left + right + merge(array, low, mid, high);
    }

    // 合并
    private int merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int index = 0;
        int count = 0;
        int p1 = low, p2 = mid + 1;
        while (p1 <= mid && p2 <= high) {
            // 构成了逆序
            if (array[p1] > array[p2]) {
                count += mid - p1 + 1;
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
                temp[index++] = array[p2++];
            } else {
                temp[index++] = array[p1++];
            }
        }
        while (p1 <= mid)
            temp[index++] = array[p1++];

        while (p2 <= high)
            temp[index++] = array[p2++];

        // 最后把temp赋值给array
        for (int i = 0; i < temp.length; i++) {
            array[low++] = temp[i];
        }

        return count% 1000000007;

    }

    // 超时
    public int InversePairs1(int[] array) {
        int res = 0;
        int len = array.length;
        int[] count = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            int num = array[i];
            if (i - 1 >= 0 && array[i - 1] <= array[i]) {
                count[i - 1] = count[i];
                res += count[i - 1];
                continue;
            }

            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > num)
                    count[i]++;
            }
            res += count[i];
        }

        return res % 1000000007;
    }
}
