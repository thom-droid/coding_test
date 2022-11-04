package ps.programmers.warmups;

public class VerifySqr {

    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
        System.out.println(solution(27));
        System.out.println(solution(125));

    }

    private static int solution(int n) {

        int div = n / 2;

        for (int i = 1; i <= div; i++) {

            if (n == i * i) {
                return 1;
            }
        }

        return 2;
    }


}
