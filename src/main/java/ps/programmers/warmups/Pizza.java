package ps.programmers.warmups;

public class Pizza {

    public static void main(String[] args) {

    }

    public static int order(int slice, int n) {
        int divisor = n / slice;
        return n % slice == 0 ? divisor : divisor + 1;
    }

}
