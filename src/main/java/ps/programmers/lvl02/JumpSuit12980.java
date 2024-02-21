package ps.programmers.lvl02;

public class JumpSuit12980 {

    public int solution(int n) {

        int ans = 0;

        while (n > 0) {

            if (n % 2 == 1) {
                ans++;
            }

            n /= 2;
        }

        return ans;
    }
}
