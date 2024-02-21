package ps.programmers.lvl02;

public class LeastBiggerNumber12911 {

    public int solution(int n) {

        boolean found = false;
        int tmp = n;
        int digitCount1 = Integer.bitCount(n);

        while (!found) {
            tmp++;
            int digitCount2 = Integer.bitCount(tmp);

            if (digitCount1 == digitCount2) {
                found = true;
            }
        }

        return tmp;
    }

}
