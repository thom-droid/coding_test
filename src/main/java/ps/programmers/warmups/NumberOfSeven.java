package ps.programmers.warmups;

public class NumberOfSeven {

    public int solution(int[] array) {
        int count = 0;
        for (int el : array) {
            count += countNumberOfSeven(String.valueOf(el));
        }

        return count;
    }

    public int countNumberOfSeven(String el) {
        int count = 0;

        for (int i = 0; i < el.length(); i++) {
            if (String.valueOf(el.charAt(i)).equals("7")) {
                count++;
            }
        }

        return count;
    }
}
