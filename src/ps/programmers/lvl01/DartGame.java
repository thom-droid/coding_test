package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.Objects;

public class DartGame {

    public int solution(String dartResult) {

        int[] score = Arrays.stream(dartResult.split("[A-Z|*|#]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).toArray();
        String[] bonus = Arrays.stream(dartResult.split("[0-9|*|#]")).filter(s -> !s.isEmpty()).toArray(String[]::new);
        String[] option = new String[3];

        updateOptions(option, dartResult, "*");
        updateOptions(option, dartResult, "#");

        for (int i = 0; i < bonus.length; i++) {
            if (bonus[i].equals("S")) {
                continue;
            }

            if (bonus[i].equals("D")) {
                score[i] = score[i] * score[i];
            }

            if (bonus[i].equals("T")) {
                score[i] = score[i] * score[i] * score[i];
            }

        }

        for (int i = 0; i < option.length; i++) {
            if (option[i] == null) {
                continue;
            }

            if (option[i].equals("*")) {
                score[i] *= 2;

                if (i - 1 >= 0) {
                    score[i - 1] *= 2;
                }
            }

            if (option[i].equals("#")) {
                score[i] *= -1;
            }
        }

        return Arrays.stream(score).sum();
    }

    private void updateOptions(String[] options, String result, String option) {

        int index = result.indexOf(option);

        if (index > 0 && index <= 2) {
            options[0] = option;
            index = result.indexOf(option, index + 1);
        }

        if (index >= 3 && index <= 5) {
            options[1] = option;
            index = result.indexOf(option, index + 1);
        }

        if (index >= 6 && index <= 9) {
            options[2] = option;
        }
    }
}

class DartGameMain {

    public static void main(String[] args) {
        DartGame dartGame = new DartGame();
        dartGame.solution("1D#2S*3S");
    }
}
