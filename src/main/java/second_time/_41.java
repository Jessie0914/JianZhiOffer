package second_time;

import java.util.ArrayList;

/**
 * @ClassName _41
 * @Description 和为S的连续正数序列
 * @Author shishi
 * @Date 2020/2/4 14:32
 **/
public class _41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int bound = (sum + 1) / 2;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int i = 1;
        int j = 2;

        while (i < j && j <= bound) {
            int temp = (i + j) * (j - i + 1) / 2;
            if (temp==sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int index = i; index<=j; index++)
                    list.add(index);
                result.add(list);
                i++;
            }else if (temp<sum)
                j++;
            else
                i++;
        }
        return result;
    }
}
