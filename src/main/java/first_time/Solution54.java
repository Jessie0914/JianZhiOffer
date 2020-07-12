package first_time; /**
 * @ClassName Solution54
 * @Description 字符流中第一个不重复的字符
 * @Author shishi
 * @Date 2020/1/18 16:36
 **/

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 */
public class Solution54 {
    LinkedHashMap<Character,Integer> linkedhashMap = new LinkedHashMap<>();

    //Insert one char from stringstream
    public void Insert(char ch) {
        if (linkedhashMap.containsKey(ch)){
            linkedhashMap.remove(ch);
        }else {
            linkedhashMap.put(ch,1);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if (linkedhashMap.size()==0)
            return '#';

        Iterator<Character> iterator = linkedhashMap.keySet().iterator();
        return iterator.next();
    }
}
