package ps.programmers.warmups;

import java.util.Arrays;

public class Rectangle {
    public int solution(int[][] dots) {
        int w = dots[0][0] == dots[1][0] ? Math.abs(dots[0][0] - dots[2][0]) : Math.abs(dots[0][0] - dots[1][0]);
        int h = dots[0][1] == dots[1][1] ? Math.abs(dots[0][1] - dots[2][1]) : Math.abs(dots[0][1] - dots[1][1]);

        int answer = w * h;
        return answer;
    }
}
