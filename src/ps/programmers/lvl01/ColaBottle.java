package ps.programmers.lvl01;

public class ColaBottle {

    public int solution(int a, int b, int n) {

        int bottles = n;
        int answer = 0;

        while (bottles >= a) {
            answer += (bottles / a) * b;
            bottles = ((bottles / a) * b) + bottles % a;
        }

        return answer;
    }
}
