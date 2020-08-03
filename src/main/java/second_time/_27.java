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
    // 全排列
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();

        if (str == null || str.length() == 0)
            return list;

        HashSet<ArrayList<Character>> hashSet = new HashSet<>();
        ArrayList<Character> cur_list = new ArrayList<>();
        char[] chars = str.toCharArray();
        boolean[] visited = new boolean[chars.length];
        // dfs函数（字符数组，访问状态数组，结果list，当前list）
        helper(chars, visited, hashSet, cur_list);

        for (ArrayList<Character> next : hashSet) {
            StringBuilder sb = new StringBuilder();
            for (Character a : next) {
                sb.append(a);
            }
            list.add(sb.toString());
        }

        // 排序（按照自然顺序排列）
        Collections.sort(list);
        return list;
    }

    private void helper(char[] chars, boolean[] visited, HashSet<ArrayList<Character>> hashSet, ArrayList<Character> cur_list) {
        // 如果当前list已经和字符数组的长度一致，说明已经遍历到底了
        if (cur_list.size() == chars.length)
            hashSet.add(new ArrayList<>(cur_list));

        // 全排列
        // 对于字符数组的每一个下标，都遍历一下
        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                // 先添加当前值
                cur_list.add(chars[i]);
                visited[i] = true;

                helper(chars, visited, hashSet, cur_list);

                // 回退一步、重置访问状态
                cur_list.remove(cur_list.size() - 1);
                visited[i] = false;
            }
        }
    }
}
