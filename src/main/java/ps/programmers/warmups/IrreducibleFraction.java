package ps.programmers.warmups;

import java.util.ArrayList;
import java.util.Arrays;

public class IrreducibleFraction {

    public int solution(int a, int b) {
        if (b == 1) {
            return 1;
        }

        int c = Math.max(a, b);

        for (int i = 2; i <= c; i++) {

            if (a == 1) {
                break;
            }

            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }

        return Arrays.stream(factorization(b)).anyMatch(x -> x != 2 && x != 5) ? 2 : 1;

    }

    public int[] factorization(int n) {
        boolean[] isChecked = new boolean[n + 1];
        isChecked[0] = isChecked[1] = true;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!isChecked[i] && n % i == 0) {
                for (int j = i * 2; j < isChecked.length; j += i) {
                    isChecked[j] = true;
                }
                list.add(i);
            }
        }

        return list.stream().mapToInt(value -> value).toArray();
    }

    public int solution2(int a, int b) {
        int answer = ((a*1000)%b == 0) ? 1 : 2;
        return answer;
    }
}
