/**
 * @program: jianzhioffer
 * @description: 二维数组中的查找
 * @author: shishi
 * @create: 2020-01-13 15:51
 **/

public class Solution1 {
    public boolean Find(int target, int [][] array) {
        int len = array.length;
        // 特判
        if (len==0) return false;

        int width = array[0].length;
        if (width==0) return false;

        int j=0,i=0;
        while (j<width&&array[0][j]<=target){
            if (array[0][j]==target)
                return true;
            j++;
        }
        if (j==width) return false;

        while (i<len&&array[i][0]<=target){
            if (array[i][0]==target)
                return true;
            i++;
        }

        for (int p=0;p<i;p++){
            for (int q=0;q<j;q++){
                if (array[p][q]==target)
                    return true;
            }
        }
        return false;
    }
}
