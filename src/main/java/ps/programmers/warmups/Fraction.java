package ps.programmers.warmups;

import java.util.Arrays;

public class Fraction {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(add(1, 2, 3, 4)));
        System.out.println(Arrays.toString(add(9, 2, 1, 3)));

    }

    public static int[] add(int denum1, int num1, int denum2, int num2) {
        int x = num1 * num2;
        int y = denum1 * num2 + denum2 * num1;

        int gcd = getGCD(x, y);

        x /= gcd;
        y /= gcd;

        return new int[]{y, x};
    }

    private static int getGCD(int x, int y) {

        if (x % y == 0) {
            return y;
        }

        return getGCD(y, x % y);

//        while (y != 0)
//        {
//            int temp = x;
//            x = y;
//            y = temp % y;
//        }
//
//        return x;

    }
}
