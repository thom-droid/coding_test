package ps.programmers.lvl01;

public class MinusPlus {

    public int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    public int solution2(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }

        return answer;
    }

}
