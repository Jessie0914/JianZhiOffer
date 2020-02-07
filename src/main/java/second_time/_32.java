package second_time;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName _32
 * @Description 把数组排成最小的数
 * @Author shishi
 * @Date 2020/2/4 19:43
 **/
public class _32 {
    public String PrintMinNumber(int[] numbers) {
        int len = numbers.length;
        String[] strings = new String[len];
        for (int i = 0; i < len; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        // 排序规则
        // S1+S2和S2+S1哪个小，就把哪个排在前面
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num1 = Integer.parseInt(o1 + o2);
                int num2 = Integer.parseInt(o2 + o1);
                if (num1 <= num2)
                    return -1;
                else
                    return 1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
