package first_time;

import java.util.*;

/**
 * @program: jianzhioffer
 * @description: 字符串的排列
 * @author: shishi
 * @create: 2020-01-15 16:09
 **/

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母
 */
public class Solution27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str==null || str.length()==0) return res;
        HashSet<List<Character>> set = new HashSet<>();
        ArrayList<Character> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        boolean[] used = new boolean[chars.length];
        recursion(used, chars, set, list);

        Iterator<List<Character>> iterator = set.iterator();
        while (iterator.hasNext()){
            List<Character> next = iterator.next();
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<next.size();i++){
                sb.append(next.get(i));
            }
            res.add(sb.toString());
        }

        Collections.sort(res);
        return res;

    }

    private void recursion(boolean[] used, char[] chars, HashSet<List<Character>> set, ArrayList<Character> list) {
        if (list.size() == chars.length) {
            set.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (!used[i]) {
                list.add(chars[i]);
                used[i] = true;

                recursion(used, chars, set, list);

                // 回退一步
                list.remove(list.size()-1);
                used[i] = false;
            }
        }
    }
}
