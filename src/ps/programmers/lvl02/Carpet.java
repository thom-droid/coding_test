package ps.programmers.lvl02;

public class Carpet {

    public int[] solution(int brown, int yellow) {

        int w;
        int h;

        for (int i = 1; i <= yellow; i++) {

            if (yellow % i == 0) {
                w = yellow / i;
                h = i;

                if (brown == (w + h) * 2 + 4) {
                    return new int[]{w + 2, h + 2};
                }
            }
        }

        return null;
    }
}
