package ps.programmers.lvl01;

import java.util.Arrays;

public class SmallestRectangle {

    public int solution(int[][] sizes) {
        int max = Arrays.stream(sizes).mapToInt(o1 -> Math.max(o1[0], o1[1])).max().orElse(0);
        int remainder = Arrays.stream(sizes).mapToInt(o1 -> Math.min(o1[0], o1[1])).max().orElse(0);

        return max * remainder;

    }

}
