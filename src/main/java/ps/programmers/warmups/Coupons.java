package ps.programmers.warmups;

public class Coupons {

    public int solution(int chicken) {

        int coupons = chicken;
        int freeChickens = 0;

        while (coupons >= 10) {
            freeChickens += coupons / 10;
            coupons -= coupons / 10;

        }

        int answer = -1;
        return answer;
    }
}
