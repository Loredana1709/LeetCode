package easy;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1 || strs.length > 200) {
            return "The array length is too small or too big";
        }
        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int index = 0;

        while(index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) != s2.charAt(index)) {
                break;
            }
            index++;
        }
        return s1.substring(0, index);
    }
}
