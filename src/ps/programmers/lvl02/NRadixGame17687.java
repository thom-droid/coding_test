package ps.programmers.lvl02;

public class NRadixGame17687 {

    public String solution(int n, int t, int m, int p) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int size = t * m;

        for (long i = 0; i < size; i++) {
            String string = Long.toString(i, n);
            sb.append(string);
        }

        int i = p - 1;

        while (sb2.length() < t) {
            sb2.append(sb.charAt(i));
            i += m;
        }

        return sb2.toString().toUpperCase();
    }

}
