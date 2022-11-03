package ps.programmers.warmups;

public class Discount {

    public static void main(String[] args) {

        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }
    private static int solution(int price) {
        if (price >= 500000) {
            return (int) (price * 0.8);
        }

        if (price >= 300000) {
            return (int) (price * 0.9);
        }

        if (price >= 100000) {
            return (int) (price * 0.95);
        }

        return price;

    }
}
