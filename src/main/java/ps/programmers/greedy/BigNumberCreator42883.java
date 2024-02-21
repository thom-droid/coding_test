package ps.programmers.greedy;

public class BigNumberCreator42883 {

    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int targetLength = number.length() - k;

        for (int i = 0; i < number.length(); i++) {

            if (k == 0 && sb.length() != targetLength) {
                sb.append(number.charAt(i));
                continue;
            }

            if (sb.length() == targetLength) {
                return sb.toString();
            }

            int index = findMaxIndex(number, i, i + k);
            k -= (index - i);
            i = index;

            sb.append(number.charAt(index));

        }

        return sb.toString();
    }

    private int findMaxIndex(String number, int start, int end) {

        if (end >= number.length()) {
            end = number.length() - 1;
        }

        int max = 0;
        int idx = 0;

        for (int i = start; i <= end; i++) {
            int num = number.charAt(i) - 48;

            if (num > max) {
                max = num;
                idx = i;
            }
        }

        if (idx == 0 && start != 0) {
            idx = start;
        }

        return idx;
    }

}
