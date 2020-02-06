package second_time;

/**
 * @ClassName _35
 * @Description 数组中的逆序对
 * @Author shishi
 * @Date 2020/2/4 15:52
 **/
public class _35 {
    public int InversePairs(int[] array) {
        if (array == null || array.length < 2)
            return 0;

        // 利用快排思想
        return merge(array, 0, array.length - 1) % 1000000007;
    }

    private int merge(int[] array, int low, int high) {
        if (low >= high)
            return 0;

        int mid = (low + high) / 2;
        int left = merge(array, low, mid) % 1000000007;
        int right = merge(array, mid + 1, high) % 1000000007;

        return (left + right + mergeSort(array, low, mid, high)) % 1000000007;
    }

    private int mergeSort(int[] array, int low, int mid, int high) {
        int res = 0;
        int[] tempArr = new int[high - low + 1];
        int index = 0;
        int p1 = low;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= high) {
            if (array[p1] <= array[p2]) {
                tempArr[index++] = array[p1++];
            } else {
                int count = mid - p1 + 1;
                count %= 1000000007;
                res += count;
                res %= 1000000007;
                tempArr[index++] = array[p2++];
            }
        }

        while (p1 <= mid) {
            tempArr[index++] = array[p1++];
        }

        while (p2 <= high) {
            tempArr[index++] = array[p2++];
        }

        for (int i = 0; i < tempArr.length; i++) {
            array[low++] = tempArr[i];
        }

        return res;
    }
}
