package ps.programmers.lvl01;

import java.util.Arrays;

public class Average {

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
