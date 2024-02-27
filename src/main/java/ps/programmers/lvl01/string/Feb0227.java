package ps.programmers.lvl01.string;

public class Feb0227 {
    public int solution(String t, String p) {
        long num1 = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String substring = t.substring(i, i + p.length());
            long num2 = Long.parseLong(substring);
            if (num1 >= num2) answer++;
        }
        return answer;
    }
}
