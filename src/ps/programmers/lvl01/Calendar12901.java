package ps.programmers.lvl01;

public class Calendar12901 {

    private static final String[] DAYS = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    private static final int[] MONTHS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public String solution(int a, int b) {

        int days = b;

        for (int i = 1; i < a; i++) {
            days += MONTHS[i];
        }

        int day = (days + 5) % 7;

        return DAYS[day];
    }

}
