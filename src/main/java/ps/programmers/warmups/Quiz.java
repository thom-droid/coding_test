package ps.programmers.warmups;

import java.util.StringTokenizer;

public class Quiz {

    public String[] solution(String[] quiz) {

        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");

            int val1 = Integer.parseInt(str[0]);
            int val2 = Integer.parseInt(str[2]);
            int val3 = Integer.parseInt(str[4]);

            if (str[1].equals("-")){
                if (val2 < 0) {
                    val2 = Math.abs(val2);
                } else {
                    val2 -= val2 * 2;
                }
            }


            String result = val1 + val2 == val3 ? "O" : "X";
            answer[i] = result;
        }

        return answer;
    }

}
