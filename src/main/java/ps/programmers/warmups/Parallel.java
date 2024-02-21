package ps.programmers.warmups;

public class Parallel {

    public int solution(int[][] dots) {

        double slopeA1 = Math.abs((double) (dots[0][0] - dots[1][0]) / (dots[0][1] - dots[1][1]));
        double slopeA2 = Math.abs((double) (dots[2][0] - dots[3][0]) / (dots[2][1] - dots[3][1]));
        double slopeB1 = Math.abs((double) (dots[0][0] - dots[2][0]) / (dots[0][1] - dots[2][1]));
        double slopeB2 = Math.abs((double) (dots[1][0] - dots[3][0]) / (dots[1][1] - dots[3][1]));
        double slopeC1 = Math.abs((double) (dots[0][0] - dots[3][0]) / (dots[0][1] - dots[3][1]));
        double slopeC2 = Math.abs((double) (dots[1][0] - dots[2][0]) / (dots[1][1] - dots[2][1]));

        return slopeA1 == slopeA2 ? 1 : slopeB1 == slopeB2 ? 1 : slopeC1 == slopeC2 ? 1 : 0;

    }

}
