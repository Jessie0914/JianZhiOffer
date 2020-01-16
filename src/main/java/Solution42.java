/**
 * @program: jianzhioffer
 * @description: 和为S的两个数字
 * @author: shishi
 * @create: 2020-01-16 13:35
 **/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 对应每个测试案例，输出两个数，小的先输出。
 */
public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array==null || array.length<2) return list;

        int[] nums = new int[2];

        // 保存的是值--下标的映射
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], i);
        }

        int chengji = Integer.MAX_VALUE;
        // 用来判断是否存在一个结果，如果一个都没有，就直接返回空的list
        boolean flag = false;

        // 遍历hashMap
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (hashMap.containsKey(sum - key) && (key * (sum - key)) < chengji) {
                flag=true;
                nums[0] = key <= (sum - key) ? key : sum - key;
                nums[1] = (sum - key) > key ? sum - key : key;
            }
        }

        if (flag){
            list.add(nums[0]);
            list.add(nums[1]);

            return list;
        }else {
            return list;
        }

    }
}
