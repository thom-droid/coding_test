package ps.programmers.warmups;

public class PrintIndex {

    public static void main(String[] args) {
        System.out.println(solution(12345, 5));
        System.out.println(solution2(12345, 5));
        System.out.println(solution2(1, 5));
        System.out.println(solution2(12333345, 3));

    }

    private static int solution(int num, int k) {
        int exp = 1;
        while (exp <= num) {
            exp *= 10;
        }

        int j = 1;
        exp /= 10;

        for (int i = exp; i >= 1; i /= 10) {
            int n = num / i % 10;
            if (k == n) {
                return j;
            }
            j++;
        }

        return -1;
    }


    private static int solution2(int num, int k) {
        String s = String.valueOf(num);
        String el = String.valueOf(k);

        return !s.contains(el) ? -1 : s.indexOf(el) + 1;
    }

}
