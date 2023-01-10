package work;

import java.util.HashSet;
import java.util.Set;

public class work02 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        Solution solution = new Solution();
        int result = solution.countConsistentStrings(allowed,words);
        if (result == words.length) {
            System.out.println("字符串为：一致字符串");
        }
        System.out.println("相同数为：");
        System.out.println(result);
    }
}

/**
 * 1684. 统计一致字符串的数目
 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。
 * 如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
 *
 * 请你返回 words 数组中 一致字符串 的数目。
 *
 */
class Solution{// 不会啊
    public int countConsistentStrings(String allowed, String[] words) {
        int sum=0;
        Set<Character> target = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            target.add(c);
        }
        for (String word : words) {
            sum++;
            for (char c : word.toCharArray()) {
                if (!target.contains(c)){
                    sum--;
                    break;
                }
            }
        }
        return sum;
    }
}




