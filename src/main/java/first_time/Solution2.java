package first_time; /**
 * @program: jianzhioffer
 * @description: 替换空格
 * @author: shishi
 * @create: 2020-01-13 16:33
 **/

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy
 */
public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        int i = 0,len = str.length();
        StringBuffer stringBuffer = new StringBuffer();

        while(i<len){
            if (str.charAt(i)!=' ') {
                stringBuffer.append(str.charAt(i));
                i++;
            }
            else {
                stringBuffer.append("%20");
                i++;
            }
        }

        return stringBuffer.toString();
    }
}
