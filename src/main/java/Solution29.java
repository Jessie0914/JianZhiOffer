import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: jianzhioffer
 * @description: 最小的K个数
 * @author: shishi
 * @create: 2020-01-15 18:02
 **/

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(input);

        if (k>input.length){
            return res;
        }

        for (int i=0;i<k;i++){
            res.add(input[i]);
        }

        return res;
    }
}
