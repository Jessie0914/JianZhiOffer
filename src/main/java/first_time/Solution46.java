package first_time; /**
 * @program: jianzhioffer
 * @description: 孩子们的游戏(圆圈中最后剩下的数)
 * @author: shishi
 * @create: 2020-01-16 16:03
 **/

/**
 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
 * HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:
 * 首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....
 * 这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
 * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 * <p>
 * 如果没有小朋友，请返回-1
 */
public class Solution46 {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0) return -1;
        if (n == 1) return 0;
        // 判断小孩是否还在车内
        boolean[] flag = new boolean[n];

        // count是指目前为止出局的小孩（要找满n-1个小孩）
        int count = 0;
        int i = -1;
        while (count != n-1) {
            int num = m;
            // 每次遍历m次值为false的小孩，能让这个小孩出局
            while (num > 0) {
                num--;
                if (i != n - 1) {
                    i++;
                    // 如果这个小孩已经出局，那再下一位，直到他的值为true
                    while (flag[i]) {
                        if (i != n - 1)
                            i++;
                        else
                            i = 0;
                    }
                }
                // 如果已经到头了，让i变成0，形成圈，重新开始遍历
                else {
                    i = 0;
                    // 同理，也要先判断小孩是不是false
                    while (flag[i]){
                        if (i!=n-1)
                            i++;
                        else
                            i=0;
                    }
                }
            }
            // 把找到的小孩置为true，意味着他出局了
            flag[i] = true;
            count++;
        }

        // 最后剩下的一个为false的小孩就是结果
        for (int j=0;j<n;j++){
            if (!flag[j])
                return j;
        }

        return -1;
    }
}
