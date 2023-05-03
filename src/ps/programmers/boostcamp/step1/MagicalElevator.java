package ps.programmers.boostcamp.step1;

public class MagicalElevator {

    public int solution(int storey) {

        // 반올림이 가능하면 올라가서 10의 자리를 만든 후 내려오는 게 빠르다.
        // 116의 경우 +4 -20 -100 로  4 + 2 + 1 = 7번으로 가능
        // -6 -10 -100 의 경우 6 + 1 + 1 = 8번
        // 106의 경우 +4 -10 -100 = 6번
        // -6 -100 = 7 번
        // 156의 경우는 어떤가? +4 +40 -200 이면 10번
        // 5의 경우는? -5 vs. +5 -10 이므로 내려가기만 하는 것이 빠르다.

        int floor = 1;
        int answer = 0;

        while (storey > floor) {
            floor *= 10;
        }

        boolean roundUp = false;

        for (int i = 10; i <= floor; i *= 10) {
            int j = i / 10;
            int d = storey % i / j;

            if (roundUp) {
                d += 1;
            }

            // 5보다 크면 올라가는 게 빠르다.
            if (d > 5) {
                roundUp = true;
                answer += 10 - d;
            } else {
                roundUp = false;
                answer += d;
            }
        }

        return answer;
    }

    public int solution2(int storey) {
        return elevator(storey);
    }

    private int elevator(int floor) {
        if(floor <=1) return floor;

        int under10 = floor % 10;
        int rest = floor / 10;

        int c1 = under10 + elevator(rest);
        int c2 = (10 - under10) + elevator(rest + 1);

        return Math.min(c1, c2);
    }
}
