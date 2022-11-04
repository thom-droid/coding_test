package ps.programmers.warmups;

public class NumberPair {

    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(20));
    }

    private static int solution(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }
}
