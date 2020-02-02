package first_time; /**
 * @program: jianzhioffer
 * @description: 翻转单词顺序列
 * @author: shishi
 * @create: 2020-01-16 14:03
 **/

/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class Solution44 {
    public String ReverseSentence(String str) {
        if (str==null || str.length()==0) return str;

        String[] strings = str.split(" ");
        int len = strings.length;

        // 要加上这个判断，因为有可能整个字符串都是空格，"   "，分割之后，变成""
        if (len==0) return str;

        // 交换
        for (int i=0;i<len/2;i++){
            String temp = strings[len-1-i];
            strings[len-1-i] = strings[i];
            strings[i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<len;i++){
            sb.append(strings[i]);
            if (i!=len-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
