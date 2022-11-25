package ps.programmers.lvl02;

import java.util.HashMap;
import java.util.LinkedList;

public class Wordplay12981 {

    public int[] solution(int n, String[] words) {

        HashMap<String, Boolean> wordStorage = new HashMap<>();
        String endingChar = "";

        for (int i = 0; i < words.length; i += n) {

            for (int j = i; j < i + n; j++) {

                if (wordStorage.get(words[j]) == Boolean.TRUE) {
                    return new int[]{j % n + 1, i / n + 1};
                }

                if (endingChar.isEmpty()) {
                    endingChar = words[j].substring(words[j].length() - 1);
                    wordStorage.put(words[j], Boolean.TRUE);
                    continue;
                }

                if (!words[j].startsWith(endingChar)) {
                    return new int[]{j % n + 1, i / n + 1};
                }

                endingChar = words[j].substring(words[j].length() - 1);
                wordStorage.put(words[j], Boolean.TRUE);

            }

        }

        return new int[]{0, 0};
    }
}
