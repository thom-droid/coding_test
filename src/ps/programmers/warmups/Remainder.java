package ps.programmers.warmups;

public class Remainder {

    public static void main(String[] args) {

    }

    public static int solution(int num1, int num2) {
        if (num1 >= num2) {
            return num1 % num2;
        }

        return -1;

    }
}
