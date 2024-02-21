package ps.programmers.warmups;

public class Duplication {

    public static void main(String[] args) {

    }

    public static int checkDuplication(int[] array, int num) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }

        return count;
    }
}
