package ps.programmers.lvl01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MBTI {

    public String solution(String[] survey, int[] choices) {
        String[] indicators = {"R", "T", "C", "F", "J", "M", "A", "N"};
        HashMap<String, Integer> score = new HashMap<>();

        for (String indicator : indicators) {
            score.put(indicator, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            String feat;
            if (choices[i] < 4) {
                feat = survey[i].charAt(0) + "";
                score.put(feat, score.get(feat) + 4 - choices[i]);
            } else {
                feat = survey[i].charAt(1) + "";
                score.put(feat, score.get(feat) + choices[i] % 4);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < indicators.length; i += 2) {
            String result = score.get(indicators[i]).compareTo(score.get(indicators[i + 1])) >= 0 ? indicators[i] : indicators[i + 1];
            sb.append(result);
        }

        return sb.toString();
    }

    private int chooseFeat(int choice) {
        return choice < 4 ? 0 : 1;
    }
}
