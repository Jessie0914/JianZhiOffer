/**
 * @program: jianzhioffer
 * @description: 第一个只出现一次的字符
 * @author: shishi
 * @create: 2020-01-15 20:42
 **/

import java.util.HashMap;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.
 */
public class Solution34 {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i=0;i<str.length();i++){
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        }

        for (int i=0;i<str.length();i++){
            if (hashMap.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
