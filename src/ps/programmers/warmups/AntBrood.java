package ps.programmers.warmups;

public class AntBrood {

    private static final int[] ANTS = new int[]{5, 3, 1};

    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }

    private static int solution(int hp) {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            while (hp >= ANTS[i]) {
                hp -= ANTS[i];
                count++;
            }
        }

        return count;

    }


}
