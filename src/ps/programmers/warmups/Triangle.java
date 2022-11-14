package ps.programmers.warmups;

public class Triangle {

    public int solution(int[] sides) {

        int max = Math.max(sides[0], sides[1]);
        int val1 = Math.abs(sides[0] - sides[1]);
        int count1 = max - val1;

        int val2 = sides[0] + sides[1];
        int count2 = val2 - max - 1;

        return count1 + count2;
    }
}
