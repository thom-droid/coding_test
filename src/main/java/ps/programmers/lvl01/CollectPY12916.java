package ps.programmers.lvl01;

public class CollectPY12916 {

    boolean solution(String s) {
        s = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pCount++;
            }

            if (s.charAt(i) == 'y') {
                yCount++;
            }

        }

        return pCount == yCount;
    }
}
