package ps.programmers.warmups;

public class ThreeSixNine {

    public int solution(int order) {
        String str = String.valueOf(order);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = Integer.parseInt(String.valueOf(str.charAt(i)));

            if (val != 0 && val % 3 == 0) {
                count++;
            }
        }
        return count;
    }
}
