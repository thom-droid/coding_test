package ps.programmers.warmups;

public class StringCompartment {

    private static final int[] NUMBERS = new int[2];

    public int solution(String s) {

        setup();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            NUMBERS[0]++;

            for (int j = i + 1; j < s.length(); j++) {
                char next = s.charAt(j);

                if (first != next) {
                    NUMBERS[1]++;
                } else {
                    NUMBERS[0]++;
                }

                if (NUMBERS[0] == NUMBERS[1]) {
                    answer++;
                    i = j;
                    setup();
                    break;
                }
            }
        }

        if (NUMBERS[0] != NUMBERS[1]) {
            answer++;
        }

        return answer;
    }

    private void setup() {
        NUMBERS[0] = 0;
        NUMBERS[1] = 0;
    }
}
