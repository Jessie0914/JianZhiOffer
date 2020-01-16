/**
 * @program: jianzhioffer
 * @description: 数字在排序数组中出现的次数
 * @author: shishi
 * @create: 2020-01-15 21:38
 **/

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Solution37 {
    public int GetNumberOfK(int [] array , int k) {
        if (array==null || array.length==0) return 0;

        int count = 0;
        int i = 0;
        while (i<array.length){
           if (array[i]==k){
               while (i<array.length && array[i]==k){
                   count++;
                   i++;
               }
               return count;
           }else
               i++;
        }
        return count;
    }
}
