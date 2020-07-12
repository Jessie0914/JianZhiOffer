package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void quickSort() {
        Sort sort = new Sort();
        int[] array = {10, 8, 7, 2, 3, 9};
        sort.sort2(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}