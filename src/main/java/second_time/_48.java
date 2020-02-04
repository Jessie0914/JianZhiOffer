package second_time;

/**
 * @ClassName _48
 * @Description 不用加减乘除做加法
 * @Author shishi
 * @Date 2020/2/4 13:53
 **/
public class _48 {
    public int Add(int num1,int num2) {
        while (num2!=0){
            int sum = num1 ^ num2;
            int carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
