package ps.programmers.warmups;

public class Digit {

    public static void main(String[] args) {
        System.out.println(sum(1234));
        System.out.println(sum(930211));
    }

    public static int sum(int n) {

        int sum = 0;
        for (int i = 1; i < n; i *= 10) {
            int digit = (n / i) % 10;
            sum += digit;
        }

        return sum;
    }
}
