package ps.programmers.warmups;

public class Pizza2 {

    public static void main(String[] args) {
        System.out.println(getLCM(20));

        Pizza2 pizza2 = new Pizza2();
        System.out.println(pizza2.solution(6));
    }

    private static int getLCM(int n) {

        return (n * 6) / getGCD(n, 6);

    }

    private static int getGCD(int x, int y) {

        if (x % y == 0) {
            return y;
        }

        return getGCD(y, x % y);

    }

    public int solution(int n) {
        return getLCM(n);
    }

}
