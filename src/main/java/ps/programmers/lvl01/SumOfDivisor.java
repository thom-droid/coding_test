package ps.programmers.lvl01;

public class SumOfDivisor {

    public int solution(int left, int right) {
        int min = (int) Math.sqrt(left);
        int size = (int) (Math.sqrt(right) - min) + 1;
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer += i;
        }

        for (int i = min; i < min + size; i++) {
            int num = i * i;
            if (num >= left && num <= right) {
                answer -= num * 2;
            }
        }

        return answer;
    }

    public int solution2(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {

            if (i % (Math.sqrt(i)) == 0) {
                answer -= i;
            } else {
                answer += i;
            }

        }

        return answer;
    }
}
