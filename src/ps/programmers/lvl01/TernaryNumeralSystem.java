package ps.programmers.lvl01;

public class TernaryNumeralSystem {

    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n >= 1) {
            sb.append(n % 3);
            n /= 3;
        }

        return Integer.parseInt(sb.toString(), 3);

    }

}
