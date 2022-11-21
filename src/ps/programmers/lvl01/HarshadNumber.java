package ps.programmers.lvl01;

public class HarshadNumber {

    public boolean solution(int x) {

        int tmp = x;
        int sum = 0;
        while (tmp > 0) {

            // 123
            sum += tmp % 10;
            tmp /= 10;

        }

        return x % sum == 0;

    }

}
