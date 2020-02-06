package second_time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @ClassName _27
 * @Description 字符串的排列
 * @Author shishi
 * @Date 2020/2/4 21:39
 **/
public class _27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();

        if (str == null || str.length() == 0)
            return list;

        HashSet<ArrayList<Character>> hashSet = new HashSet<>();
        ArrayList<Character> cur_list = new ArrayList<>();
        char[] chars = str.toCharArray();
        boolean[] visited = new boolean[chars.length];
        helper(chars, visited, hashSet, cur_list);

        for (ArrayList<Character> next : hashSet) {
            StringBuilder sb = new StringBuilder();
            for (Character a : next) {
                sb.append(a);
            }
            list.add(sb.toString());
        }

        // 排序
        Collections.sort(list);
        return list;
    }

    private void helper(char[] chars, boolean[] visited, HashSet<ArrayList<Character>> hashSet, ArrayList<Character> cur_list) {
        if (cur_list.size() == chars.length)
            hashSet.add(new ArrayList<>(cur_list));

        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                cur_list.add(chars[i]);
                visited[i] = true;
                helper(chars, visited, hashSet, cur_list);

                cur_list.remove(cur_list.size() - 1);
                visited[i] = false;
            }
        }
    }
}
