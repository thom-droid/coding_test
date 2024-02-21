package ps.leet;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    private static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs[0].equals("")) {
            return "";
        }

        Arrays.sort(strs, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(strs));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char prefix = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (prefix != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(prefix);
        }
        return sb.toString();
    }
}
