package ps.programmers.lvl01;

public class WeaponsForKnights136798 {

    public int solution(int number, int limit, int power) {

        int ironNeeded = 0;

        for (int i = 1; i <= number; i++) {

            if (i <= 2) {
                ironNeeded += i;
                continue;
            }

            int cd = 0;

            for (int j = 1; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    cd +=2;
                }

                if (Math.sqrt(i) == j) {
                    cd--;
                }
            }

            ironNeeded += cd > limit ? power : cd;
        }

        return ironNeeded;
    }
}
