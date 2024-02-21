package ps.programmers.lvl01;

public class MoneyNeeded {

    public long solution(int price, int money, int count) {

        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }

        return money >= sum ? 0 : sum - money;
    }
}
