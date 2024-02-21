package ps.programmers.warmups;

import java.util.HashMap;
import java.util.Map;

public class EnglishHater {

    public long solution(String numbers) {
        HashMap<String, String> map = new HashMap<>();
        String[] letters = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i <= 9; i++) {
            map.put(letters[i], String.valueOf(i));
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            numbers = numbers.replaceAll(entry.getKey(), entry.getValue());
        }

        return Long.parseLong(numbers);
    }
}
