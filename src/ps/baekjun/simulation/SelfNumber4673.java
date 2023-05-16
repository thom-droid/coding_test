package ps.baekjun.simulation;

public class SelfNumber4673 {

    private static final boolean[] array = new boolean[20002];

    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) {
            array[calculate(i)] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if (!array[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    private static int calculate(int x) {

        // x + x의 자리수
        int sum = x;
        while (x > 0) {

            int d = x % 10;
            x = x / 10;
            sum += d;
        }

        return sum;
    }
}
