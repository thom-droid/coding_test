package ps.programmers.lvl01;

public class Collatz {

    public int solution(int num) {
        if (num == 1) {
            return 0;
        }
        long tmp = num;

        int answer = 0;

        while (tmp > 1) {

            if (answer >= 500) {
                return -1;
            }

            if (tmp % 2 == 0) {
                tmp /= 2;

            } else {

                tmp = tmp * 3 + 1;
            }

            answer++;

        }

        return answer;
    }
}
