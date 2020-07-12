package practice;

/**
 * @ClassName Sort
 * @Description TODO
 * @Author shishi
 * @Date 2020/2/27 17:22
 **/
public class Sort {
    /**
     * 快速排序
     *
     * @param array
     */
    public void quickSort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    private void quick(int[] array, int left, int right) {
        if (left >= right)
            return;
        int pivot = array[left];

        int p1 = left;
        int p2 = right;
        while (p1 < p2) {
            while (p1 < p2 && array[p2] >= pivot)
                p2--;
            swap(array, p1, p2);

            while (p1 < p2 && array[p1] < pivot)
                p1++;
            swap(array, p1, p2);
        }

        array[p1] = pivot;
        quick(array, left, p1);
        quick(array, p1 + 1, right);
    }

    private void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    /**
     * 归并排序
     *
     * @param array
     */
    public void sort2(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        if (left >= right)
            return;

        int index = 0;
        int[] temp = new int[right - left + 1];

        int p1 = left;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            if (array[p1] <= array[p2])
                temp[index++] = array[p1++];
            else
                temp[index++] = array[p2++];
        }

        while (p1 <= mid)
            temp[index++] = array[p1++];

        while (p2 <= right)
            temp[index++] = array[p2++];

        for (int i=0;i<index;i++){
            array[left++] = temp[i];
        }
    }
}
