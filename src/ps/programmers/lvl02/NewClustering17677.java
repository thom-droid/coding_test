package ps.programmers.lvl02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NewClustering17677 {

    public int solution(String str1, String str2) {

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        fillSplitLetters(list1, s1);
        fillSplitLetters(list2, s2);

        int whole = list1.size() + list2.size();

        int intersection = 0;

        for (int i = 0; i < list1.size(); i++) {
            String s = list1.get(i);
            if (list2.contains(s)) {
                list2.remove(s);
                intersection++;
            }
        }

        int union = whole - intersection;

        if (union == 0 && intersection == 0) {
            return 65536;
        }

        double tmp = (double) intersection / (double) union;


        return (int) (tmp * 65536);
    }

    private void fillSplitLetters(ArrayList<String> list, String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder();

            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);

            if (c1 < 97 || c1 > 122 || c2 < 97 || c2 > 122) {
                continue;
            }

            list.add(sb.append(c1).append(c2).toString());
        }
    }
}
