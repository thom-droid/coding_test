package ps.programmers.warmups;

public class Chicken {

    public int solution(int chicken) {
        int coupons = chicken;
        int free = 0;
        while (coupons >= 10) {
            free += coupons / 10;
            coupons = (coupons / 10) + (coupons % 10);
        }

        return free;
    }
}
