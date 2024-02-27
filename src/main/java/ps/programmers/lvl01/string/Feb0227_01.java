package ps.programmers.lvl01.string;

public class Feb0227_01 {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        answer[0] = -1;
        for (int i = len - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
                answer[i] = -1;
            }
        }
        return answer;
    }
}
