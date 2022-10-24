package ps.programmers.warmups;

public class OddAndEven {

    public static void main(String[] args) {

    }

    public static int[] count(int[] num_list) {

        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        return new int[]{even, odd};
    }
}
